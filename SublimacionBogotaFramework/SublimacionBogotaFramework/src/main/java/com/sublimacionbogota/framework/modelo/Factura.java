package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;

    private String estadoFactura;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExportacionFactura;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConfirmacionFactura;

    @Column(name = "Pedido_idPedido")
    private Long pedidoIdPedido;

    public Factura() {}

    public Factura(Long idFactura, String estadoFactura, Date fechaExportacionFactura,
                   Date fechaConfirmacionFactura, Long pedidoIdPedido) {
        this.idFactura = idFactura;
        this.estadoFactura = estadoFactura;
        this.fechaExportacionFactura = fechaExportacionFactura;
        this.fechaConfirmacionFactura = fechaConfirmacionFactura;
        this.pedidoIdPedido = pedidoIdPedido;
    }

    // Getters y Setters
    public Long getIdFactura() { return idFactura; }
    public void setIdFactura(Long idFactura) { this.idFactura = idFactura; }

    public String getEstadoFactura() { return estadoFactura; }
    public void setEstadoFactura(String estadoFactura) { this.estadoFactura = estadoFactura; }

    public Date getFechaExportacionFactura() { return fechaExportacionFactura; }
    public void setFechaExportacionFactura(Date fechaExportacionFactura) { this.fechaExportacionFactura = fechaExportacionFactura; }

    public Date getFechaConfirmacionFactura() { return fechaConfirmacionFactura; }
    public void setFechaConfirmacionFactura(Date fechaConfirmacionFactura) { this.fechaConfirmacionFactura = fechaConfirmacionFactura; }

    public Long getPedidoIdPedido() { return pedidoIdPedido; }
    public void setPedidoIdPedido(Long pedidoIdPedido) { this.pedidoIdPedido = pedidoIdPedido; }
}