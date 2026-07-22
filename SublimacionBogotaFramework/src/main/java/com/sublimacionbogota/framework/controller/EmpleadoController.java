package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.EmpleadoRepository;
import com.sublimacionbogota.framework.modelo.Empleado;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    // READ
    @GetMapping
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        empleado.setIdEmpleado(id);
        return empleadoRepository.save(empleado);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        empleadoRepository.deleteById(id);
    }
}