package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.DetallePedidoRepository;
import com.sublimacionbogota.framework.modelo.DetallePedido;

@RestController
@RequestMapping("/detalles")
public class DetallePedidoController {

    private final DetallePedidoRepository detalleRepository;

    public DetallePedidoController(DetallePedidoRepository detalleRepository) {
        this.detalleRepository = detalleRepository;
    }

    // READ
    @GetMapping
    public List<DetallePedido> listarDetalles() {
        return detalleRepository.findAll();
    }

    // CREATE
    @PostMapping
    public DetallePedido crearDetalle(@RequestBody DetallePedido detalle) {
        return detalleRepository.save(detalle);
    }

    // UPDATE
    @PutMapping("/{id}")
    public DetallePedido actualizarDetalle(@PathVariable Long id, @RequestBody DetallePedido detalle) {
        detalle.setIdDetalle(id);
        return detalleRepository.save(detalle);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarDetalle(@PathVariable Long id) {
        detalleRepository.deleteById(id);
    }
}