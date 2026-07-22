package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.InsumosRepository;
import com.sublimacionbogota.framework.modelo.Insumos;

@RestController
@RequestMapping("/insumos")
public class InsumosController {

    private final InsumosRepository insumosRepository;

    public InsumosController(InsumosRepository insumosRepository) {
        this.insumosRepository = insumosRepository;
    }

    // READ
    @GetMapping
    public List<Insumos> listarInsumos() {
        return insumosRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Insumos crearInsumo(@RequestBody Insumos insumo) {
        return insumosRepository.save(insumo);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Insumos actualizarInsumo(@PathVariable Long id, @RequestBody Insumos insumo) {
        insumo.setIdInsumo(id);
        return insumosRepository.save(insumo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarInsumo(@PathVariable Long id) {
        insumosRepository.deleteById(id);
    }
}