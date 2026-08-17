package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.HashMap;
import java.util.Map;
import com.sublimacionbogota.framework.dao.UsuarioRepository;
import com.sublimacionbogota.framework.modelo.Usuario;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String correo = credentials.get("correoUsuario");
        String contrasena = credentials.get("contrasenaUsuario");

        Usuario usuario = usuarioRepository.findByCorreoUsuario(correo);
        if (usuario != null && passwordEncoder.matches(contrasena, usuario.getContrasenaUsuario())) {
            Map<String, Object> response = new HashMap<>();
            response.put("token", "fake-jwt-token-" + usuario.getIdUsuario()); // Simulación de token
            response.put("rolUsuario", usuario.getRolUsuario());
            response.put("nombreUsuario", usuario.getNombreUsuario());
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
    }

    // REGISTRO
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Usuario nuevoUsuario) {
        if (usuarioRepository.findByCorreoUsuario(nuevoUsuario.getCorreoUsuario()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("El correo ya está registrado");
        }

        nuevoUsuario.setContrasenaUsuario(passwordEncoder.encode(nuevoUsuario.getContrasenaUsuario()));
        Usuario guardado = usuarioRepository.save(nuevoUsuario);

        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "Usuario registrado exitosamente");
        response.put("usuario", guardado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}