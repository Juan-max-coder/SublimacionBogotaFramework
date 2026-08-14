package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reporte")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;

    private String tipoReporte;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReporte;

    @Column(name = "Usuario_idUsuario")
    private Long usuarioIdUsuario;

    public Reporte() {}

    public Reporte(Long idReporte, String tipoReporte, Date fechaReporte, Long usuarioIdUsuario) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.fechaReporte = fechaReporte;
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    // Getters y Setters
    public Long getIdReporte() { return idReporte; }
    public void setIdReporte(Long idReporte) { this.idReporte = idReporte; }

    public String getTipoReporte() { return tipoReporte; }
    public void setTipoReporte(String tipoReporte) { this.tipoReporte = tipoReporte; }

    public Date getFechaReporte() { return fechaReporte; }
    public void setFechaReporte(Date fechaReporte) { this.fechaReporte = fechaReporte; }

    public Long getUsuarioIdUsuario() { return usuarioIdUsuario; }
    public void setUsuarioIdUsuario(Long usuarioIdUsuario) { this.usuarioIdUsuario = usuarioIdUsuario; }
}