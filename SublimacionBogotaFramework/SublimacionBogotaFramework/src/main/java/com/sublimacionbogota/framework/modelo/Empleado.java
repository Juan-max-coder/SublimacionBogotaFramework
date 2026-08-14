package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    private String nombreEmpleado;
    private String cargoEmpleado;
    private String areaEmpleado;
    private String contactoEmpleado;

    @Column(name = "Usuario_idUsuario")
    private Long usuarioIdUsuario;

    public Empleado() {}

    public Empleado(Long idEmpleado, String nombreEmpleado, String cargoEmpleado,
                    String areaEmpleado, String contactoEmpleado, Long usuarioIdUsuario) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.areaEmpleado = areaEmpleado;
        this.contactoEmpleado = contactoEmpleado;
        this.usuarioIdUsuario = usuarioIdUsuario;
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

    public Long getUsuarioIdUsuario() { return usuarioIdUsuario; }
    public void setUsuarioIdUsuario(Long usuarioIdUsuario) { this.usuarioIdUsuario = usuarioIdUsuario; }
}