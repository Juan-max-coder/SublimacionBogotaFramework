package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "TareaProduccion")
public class TareaProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarea;

    private String descripcionTarea;
    private String estadoTarea;
    private double avanceTarea;

    @Column(name = "Empleado_idEmpleado")
    private Long empleadoIdEmpleado;

    @Column(name = "Produccion_idProduccion")
    private Long produccionIdProduccion;

    public TareaProduccion() {}

    public TareaProduccion(Long idTarea, String descripcionTarea, String estadoTarea,
                           double avanceTarea, Long empleadoIdEmpleado, Long produccionIdProduccion) {
        this.idTarea = idTarea;
        this.descripcionTarea = descripcionTarea;
        this.estadoTarea = estadoTarea;
        this.avanceTarea = avanceTarea;
        this.empleadoIdEmpleado = empleadoIdEmpleado;
        this.produccionIdProduccion = produccionIdProduccion;
    }

    // Getters y Setters
    public Long getIdTarea() { return idTarea; }
    public void setIdTarea(Long idTarea) { this.idTarea = idTarea; }

    public String getDescripcionTarea() { return descripcionTarea; }
    public void setDescripcionTarea(String descripcionTarea) { this.descripcionTarea = descripcionTarea; }

    public String getEstadoTarea() { return estadoTarea; }
    public void setEstadoTarea(String estadoTarea) { this.estadoTarea = estadoTarea; }

    public double getAvanceTarea() { return avanceTarea; }
    public void setAvanceTarea(double avanceTarea) { this.avanceTarea = avanceTarea; }

    public Long getEmpleadoIdEmpleado() { return empleadoIdEmpleado; }
    public void setEmpleadoIdEmpleado(Long empleadoIdEmpleado) { this.empleadoIdEmpleado = empleadoIdEmpleado; }

    public Long getProduccionIdProduccion() { return produccionIdProduccion; }
    public void setProduccionIdProduccion(Long produccionIdProduccion) { this.produccionIdProduccion = produccionIdProduccion; }
}