package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Insumos")
public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInsumo;

    private String nombreInsumo;
    private double costoInsumo;
    private int stockInsumo;
    private double precioInsumo;

    @Column(name = "InventarioMovimiento_idMovimiento")
    private Long inventarioMovimientoIdMovimiento;

    public Insumos() {}

    public Insumos(Long idInsumo, String nombreInsumo, double costoInsumo,
                   int stockInsumo, double precioInsumo, Long inventarioMovimientoIdMovimiento) {
        this.idInsumo = idInsumo;
        this.nombreInsumo = nombreInsumo;
        this.costoInsumo = costoInsumo;
        this.stockInsumo = stockInsumo;
        this.precioInsumo = precioInsumo;
        this.inventarioMovimientoIdMovimiento = inventarioMovimientoIdMovimiento;
    }

    // Getters y Setters
    public Long getIdInsumo() { return idInsumo; }
    public void setIdInsumo(Long idInsumo) { this.idInsumo = idInsumo; }

    public String getNombreInsumo() { return nombreInsumo; }
    public void setNombreInsumo(String nombreInsumo) { this.nombreInsumo = nombreInsumo; }

    public double getCostoInsumo() { return costoInsumo; }
    public void setCostoInsumo(double costoInsumo) { this.costoInsumo = costoInsumo; }

    public int getStockInsumo() { return stockInsumo; }
    public void setStockInsumo(int stockInsumo) { this.stockInsumo = stockInsumo; }

    public double getPrecioInsumo() { return precioInsumo; }
    public void setPrecioInsumo(double precioInsumo) { this.precioInsumo = precioInsumo; }

    public Long getInventarioMovimientoIdMovimiento() { return inventarioMovimientoIdMovimiento; }
    public void setInventarioMovimientoIdMovimiento(Long inventarioMovimientoIdMovimiento) { this.inventarioMovimientoIdMovimiento = inventarioMovimientoIdMovimiento; }
}