package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.MaterialRepository;
import com.sublimacionbogota.framework.modelo.Material;

@RestController
@RequestMapping("/materiales")
public class MaterialController {

    private final MaterialRepository materialRepository;

    public MaterialController(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    // READ
    @GetMapping
    public List<Material> listarMateriales() {
        return materialRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Material crearMaterial(@RequestBody Material material) {
        return materialRepository.save(material);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Material actualizarMaterial(@PathVariable Long id, @RequestBody Material material) {
        material.setIdMaterial(id);
        return materialRepository.save(material);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarMaterial(@PathVariable Long id) {
        materialRepository.deleteById(id);
    }
}