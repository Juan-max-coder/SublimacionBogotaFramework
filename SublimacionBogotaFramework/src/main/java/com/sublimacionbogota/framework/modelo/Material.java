package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaterial;

    private String nombreMaterial;
    private String tipoMaterial;
    private String colorMaterial;
    private double cantidadDisponibleMaterial;

    @Column(name = "Cliente_idCliente")
    private Long clienteIdCliente;

    public Material() {}

    public Material(Long idMaterial, String nombreMaterial, String tipoMaterial,
                    String colorMaterial, double cantidadDisponibleMaterial,
                    Long clienteIdCliente) {
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.colorMaterial = colorMaterial;
        this.cantidadDisponibleMaterial = cantidadDisponibleMaterial;
        this.clienteIdCliente = clienteIdCliente;
    }

    // Getters y Setters
    public Long getIdMaterial() { return idMaterial; }
    public void setIdMaterial(Long idMaterial) { this.idMaterial = idMaterial; }

    public String getNombreMaterial() { return nombreMaterial; }
    public void setNombreMaterial(String nombreMaterial) { this.nombreMaterial = nombreMaterial; }

    public String getTipoMaterial() { return tipoMaterial; }
    public void setTipoMaterial(String tipoMaterial) { this.tipoMaterial = tipoMaterial; }

    public String getColorMaterial() { return colorMaterial; }
    public void setColorMaterial(String colorMaterial) { this.colorMaterial = colorMaterial; }

    public double getCantidadDisponibleMaterial() { return cantidadDisponibleMaterial; }
    public void setCantidadDisponibleMaterial(double cantidadDisponibleMaterial) { this.cantidadDisponibleMaterial = cantidadDisponibleMaterial; }

    public Long getClienteIdCliente() { return clienteIdCliente; }
    public void setClienteIdCliente(Long clienteIdCliente) { this.clienteIdCliente = clienteIdCliente; }
}