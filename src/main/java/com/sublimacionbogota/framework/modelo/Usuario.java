package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String apellidoUsuario;

    @Column(unique = true, nullable = false)
    private String correoUsuario;

    @Column(nullable = false)
    private String contrasenaUsuario;

    @Column(nullable = false)
    private String rolUsuario;

    private Boolean estadoUsuario = true;

    @OneToOne
    @JoinColumn(name = "empleado_id", referencedColumnName = "idEmpleado")
    private Empleado empleado;

    public Usuario() {}

    public Usuario(Long idUsuario, String nombreUsuario, String apellidoUsuario,
                   String correoUsuario, String contrasenaUsuario, String rolUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = new BCryptPasswordEncoder().encode(contrasenaUsuario);
        this.rolUsuario = rolUsuario;
    }

    // Getters y Setters
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getApellidoUsuario() { return apellidoUsuario; }
    public void setApellidoUsuario(String apellidoUsuario) { this.apellidoUsuario = apellidoUsuario; }

    public String getCorreoUsuario() { return correoUsuario; }
    public void setCorreoUsuario(String correoUsuario) { this.correoUsuario = correoUsuario; }

    public String getContrasenaUsuario() { return contrasenaUsuario; }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = new BCryptPasswordEncoder().encode(contrasenaUsuario);
    }

    public String getRolUsuario() { return rolUsuario; }
    public void setRolUsuario(String rolUsuario) { this.rolUsuario = rolUsuario; }

    public Boolean getEstadoUsuario() { return estadoUsuario; }
    public void setEstadoUsuario(Boolean estadoUsuario) { this.estadoUsuario = estadoUsuario; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
}