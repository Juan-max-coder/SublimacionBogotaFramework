package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(nullable = false)
    private String nombreEmpleado;

    @Column(nullable = false)
    private String cargoEmpleado;

    @Column(nullable = false)
    private String areaEmpleado;

    @Column(nullable = false)
    private String contactoEmpleado;

    @OneToOne(mappedBy = "empleado")
    private Usuario usuario; // relación inversa con Usuario

    public Empleado() {}

    public Empleado(Long idEmpleado, String nombreEmpleado, String cargoEmpleado,
                    String areaEmpleado, String contactoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.areaEmpleado = areaEmpleado;
        this.contactoEmpleado = contactoEmpleado;
    }

    // Getters y Setters
    public Long getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(Long idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombreEmpleado() { return nombreEmpleado; }
    public void setNombreEmpleado(String nombreEmpleado) { this.nombreEmpleado = nombreEmpleado; }

    public String getCargoEmpleado() { return cargoEmpleado; }
    public void setCargoEmpleado(String cargoEmpleado) { this.cargoEmpleado = cargoEmpleado; }

    public String getAreaEmpleado() { return areaEmpleado; }
    public void setAreaEmpleado(String areaEmpleado) { this.areaEmpleado = areaEmpleado; }

    public String getContactoEmpleado() { return contactoEmpleado; }
    public void setContactoEmpleado(String contactoEmpleado) { this.contactoEmpleado = contactoEmpleado; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}