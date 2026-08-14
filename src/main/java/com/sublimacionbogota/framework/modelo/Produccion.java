package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Produccion")
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduccion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioProduccion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinProduccion;

    private String estadoProduccion;

    @Column(name = "Pedido_idPedido")
    private Long pedidoIdPedido;

    public Produccion() {}

    public Produccion(Long idProduccion, Date fechaInicioProduccion, Date fechaFinProduccion,
                      String estadoProduccion, Long pedidoIdPedido) {
        this.idProduccion = idProduccion;
        this.fechaInicioProduccion = fechaInicioProduccion;
        this.fechaFinProduccion = fechaFinProduccion;
        this.estadoProduccion = estadoProduccion;
        this.pedidoIdPedido = pedidoIdPedido;
    }

    // Getters y Setters
    public Long getIdProduccion() { return idProduccion; }
    public void setIdProduccion(Long idProduccion) { this.idProduccion = idProduccion; }

    public Date getFechaInicioProduccion() { return fechaInicioProduccion; }
    public void setFechaInicioProduccion(Date fechaInicioProduccion) { this.fechaInicioProduccion = fechaInicioProduccion; }

    public Date getFechaFinProduccion() { return fechaFinProduccion; }
    public void setFechaFinProduccion(Date fechaFinProduccion) { this.fechaFinProduccion = fechaFinProduccion; }

    public String getEstadoProduccion() { return estadoProduccion; }
    public void setEstadoProduccion(String estadoProduccion) { this.estadoProduccion = estadoProduccion; }

    public Long getPedidoIdPedido() { return pedidoIdPedido; }
    public void setPedidoIdPedido(Long pedidoIdPedido) { this.pedidoIdPedido = pedidoIdPedido; }
}