package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "InventarioMovimiento")
public class InventarioMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimiento;

    private String tipoMovimiento;
    private double cantidadDelMovimiento;
    private String detallesDelMaterialEnMovimiento;

    @Column(name = "Material_idMaterial")
    private Long materialIdMaterial;

    public InventarioMovimiento() {}

    public InventarioMovimiento(Long idMovimiento, String tipoMovimiento, double cantidadDelMovimiento,
                                String detallesDelMaterialEnMovimiento, Long materialIdMaterial) {
        this.idMovimiento = idMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidadDelMovimiento = cantidadDelMovimiento;
        this.detallesDelMaterialEnMovimiento = detallesDelMaterialEnMovimiento;
        this.materialIdMaterial = materialIdMaterial;
    }

    // Getters y Setters
    public Long getIdMovimiento() { return idMovimiento; }
    public void setIdMovimiento(Long idMovimiento) { this.idMovimiento = idMovimiento; }

    public String getTipoMovimiento() { return tipoMovimiento; }
    public void setTipoMovimiento(String tipoMovimiento) { this.tipoMovimiento = tipoMovimiento; }

    public double getCantidadDelMovimiento() { return cantidadDelMovimiento; }
    public void setCantidadDelMovimiento(double cantidadDelMovimiento) { this.cantidadDelMovimiento = cantidadDelMovimiento; }

    public String getDetallesDelMaterialEnMovimiento() { return detallesDelMaterialEnMovimiento; }
    public void setDetallesDelMaterialEnMovimiento(String detallesDelMaterialEnMovimiento) { this.detallesDelMaterialEnMovimiento = detallesDelMaterialEnMovimiento; }

    public Long getMaterialIdMaterial() { return materialIdMaterial; }
    public void setMaterialIdMaterial(Long materialIdMaterial) { this.materialIdMaterial = materialIdMaterial; }
}