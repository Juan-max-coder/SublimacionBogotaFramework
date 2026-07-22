package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.TareaProduccionRepository;
import com.sublimacionbogota.framework.modelo.TareaProduccion;

@RestController
@RequestMapping("/tareas")
public class TareaProduccionController {

    private final TareaProduccionRepository tareaRepository;

    public TareaProduccionController(TareaProduccionRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    // READ
    @GetMapping
    public List<TareaProduccion> listarTareas() {
        return tareaRepository.findAll();
    }

    // CREATE
    @PostMapping
    public TareaProduccion crearTarea(@RequestBody TareaProduccion tarea) {
        return tareaRepository.save(tarea);
    }

    // UPDATE
    @PutMapping("/{id}")
    public TareaProduccion actualizarTarea(@PathVariable Long id, @RequestBody TareaProduccion tarea) {
        tarea.setIdTarea(id);
        return tareaRepository.save(tarea);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaRepository.deleteById(id);
    }
}