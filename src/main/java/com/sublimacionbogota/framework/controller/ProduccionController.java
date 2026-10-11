package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.ProduccionRepository;
import com.sublimacionbogota.framework.modelo.Produccion;

@RestController
@RequestMapping("/producciones")
public class ProduccionController {

    private final ProduccionRepository produccionRepository;

    public ProduccionController(ProduccionRepository produccionRepository) {
        this.produccionRepository = produccionRepository;
    }

    // READ
    @GetMapping
    public List<Produccion> listarProducciones() {
        return produccionRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Produccion crearProduccion(@RequestBody Produccion produccion) {
        return produccionRepository.save(produccion);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Produccion actualizarProduccion(@PathVariable Long id, @RequestBody Produccion produccion) {
        produccion.setIdProduccion(id);
        return produccionRepository.save(produccion);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarProduccion(@PathVariable Long id) {
        produccionRepository.deleteById(id);
    }
}