package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.FacturaRepository;
import com.sublimacionbogota.framework.modelo.Factura;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    private final FacturaRepository facturaRepository;

    public FacturaController(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    // READ
    @GetMapping
    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Factura crearFactura(@RequestBody Factura factura) {
        return facturaRepository.save(factura);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Factura actualizarFactura(@PathVariable Long id, @RequestBody Factura factura) {
        factura.setIdFactura(id);
        return facturaRepository.save(factura);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarFactura(@PathVariable Long id) {
        facturaRepository.deleteById(id);
    }
}