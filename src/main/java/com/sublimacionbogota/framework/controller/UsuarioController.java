package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.sublimacionbogota.framework.dao.UsuarioRepository;
import com.sublimacionbogota.framework.modelo.Usuario;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // READ - listar todos
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // READ - consultar por correo
    @GetMapping("/correo/{correo}")
    public Usuario consultarPorCorreo(@PathVariable String correo) {
        return usuarioRepository.findByCorreoUsuario(correo);
    }

    // CREATE
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        usuario.setContrasenaUsuario(passwordEncoder.encode(usuario.getContrasenaUsuario()));
        return usuarioRepository.save(usuario);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        usuario.setContrasenaUsuario(passwordEncoder.encode(usuario.getContrasenaUsuario()));
        return usuarioRepository.save(usuario);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}