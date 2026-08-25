package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.sublimacionbogota.framework.dao.UsuarioRepository;
import com.sublimacionbogota.framework.modelo.Usuario;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/correo/{correo}")
    public Usuario consultarPorCorreo(@PathVariable String correo) {
        return usuarioRepository.findByCorreoUsuario(correo);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        usuario.setContrasenaUsuario(passwordEncoder.encode(usuario.getContrasenaUsuario()));
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        usuario.setContrasenaUsuario(passwordEncoder.encode(usuario.getContrasenaUsuario()));
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}