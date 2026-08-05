
package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.ReporteRepository;
import com.sublimacionbogota.framework.modelo.Reporte;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reportes")
public class ReporteController {

    private final ReporteRepository reporteRepository;

    public ReporteController(ReporteRepository reporteRepository) {
        this.reporteRepository = reporteRepository;
    }

    // READ
    @GetMapping
    public List<Reporte> listarReportes() {
        return reporteRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Reporte crearReporte(@RequestBody Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Reporte actualizarReporte(@PathVariable Long id, @RequestBody Reporte reporte) {
        reporte.setIdReporte(id);
        return reporteRepository.save(reporte);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarReporte(@PathVariable Long id) {
        reporteRepository.deleteById(id);
    }
}