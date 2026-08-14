package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;

    private double cantidadMaterial;
    private double precioUnitarioMaterial;
    private double costoManoDeObra;
    private double subtotalPedido;

    @Column(name = "Pedido_idPedido")
    private Long pedidoIdPedido;

    @Column(name = "Material_idMaterial")
    private Long materialIdMaterial;

    @Column(name = "Insumos_idInsumo")
    private Long insumosIdInsumo;

    public DetallePedido() {}

    public DetallePedido(Long idDetalle, double cantidadMaterial, double precioUnitarioMaterial,
                         double costoManoDeObra, double subtotalPedido,
                         Long pedidoIdPedido, Long materialIdMaterial, Long insumosIdInsumo) {
        this.idDetalle = idDetalle;
        this.cantidadMaterial = cantidadMaterial;
        this.precioUnitarioMaterial = precioUnitarioMaterial;
        this.costoManoDeObra = costoManoDeObra;
        this.subtotalPedido = subtotalPedido;
        this.pedidoIdPedido = pedidoIdPedido;
        this.materialIdMaterial = materialIdMaterial;
        this.insumosIdInsumo = insumosIdInsumo;
    }

    // ✅ Getters y Setters
    public Long getIdDetalle() { return idDetalle; }
    public void setIdDetalle(Long idDetalle) { this.idDetalle = idDetalle; }

    public double getCantidadMaterial() { return cantidadMaterial; }
    public void setCantidadMaterial(double cantidadMaterial) { this.cantidadMaterial = cantidadMaterial; }

    public double getPrecioUnitarioMaterial() { return precioUnitarioMaterial; }
    public void setPrecioUnitarioMaterial(double precioUnitarioMaterial) { this.precioUnitarioMaterial = precioUnitarioMaterial; }

    public double getCostoManoDeObra() { return costoManoDeObra; }
    public void setCostoManoDeObra(double costoManoDeObra) { this.costoManoDeObra = costoManoDeObra; }

    public double getSubtotalPedido() { return subtotalPedido; }
    public void setSubtotalPedido(double subtotalPedido) { this.subtotalPedido = subtotalPedido; }

    public Long getPedidoIdPedido() { return pedidoIdPedido; }
    public void setPedidoIdPedido(Long pedidoIdPedido) { this.pedidoIdPedido = pedidoIdPedido; }

    public Long getMaterialIdMaterial() { return materialIdMaterial; }
    public void setMaterialIdMaterial(Long materialIdMaterial) { this.materialIdMaterial = materialIdMaterial; }

    public Long getInsumosIdInsumo() { return insumosIdInsumo; }
    public void setInsumosIdInsumo(Long insumosIdInsumo) { this.insumosIdInsumo = insumosIdInsumo; }
}