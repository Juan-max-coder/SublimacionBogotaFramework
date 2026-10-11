package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.InventarioMovimientoRepository;
import com.sublimacionbogota.framework.modelo.InventarioMovimiento;

@RestController
@RequestMapping("/movimientos")
public class InventarioMovimientoController {

    private final InventarioMovimientoRepository movimientoRepository;

    public InventarioMovimientoController(InventarioMovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    // READ
    @GetMapping
    public List<InventarioMovimiento> listarMovimientos() {
        return movimientoRepository.findAll();
    }

    // CREATE
    @PostMapping
    public InventarioMovimiento crearMovimiento(@RequestBody InventarioMovimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    // UPDATE
    @PutMapping("/{id}")
    public InventarioMovimiento actualizarMovimiento(@PathVariable Long id, @RequestBody InventarioMovimiento movimiento) {
        movimiento.setIdMovimiento(id);
        return movimientoRepository.save(movimiento);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarMovimiento(@PathVariable Long id) {
        movimientoRepository.deleteById(id);
    }
}