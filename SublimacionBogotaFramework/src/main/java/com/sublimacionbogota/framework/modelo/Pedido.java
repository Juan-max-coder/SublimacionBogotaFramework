package com.sublimacionbogota.framework.modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroPedido;

    private String estadoPedido;
    private String prioridadPedido;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregaEstimadaPedido;

    @Column(name = "Material_idMaterial")
    private Long materialIdMaterial;

    @Column(name = "Cliente_idCliente")
    private Long clienteIdCliente;

    @Column(name = "Empleado_idEmpleado")
    private Long empleadoIdEmpleado;

    public Pedido() {}

    public Pedido(Long idPedido, Date fechaRegistroPedido, String estadoPedido,
                  String prioridadPedido, Date fechaEntregaEstimadaPedido,
                  Long materialIdMaterial, Long clienteIdCliente, Long empleadoIdEmpleado) {
        this.idPedido = idPedido;
        this.fechaRegistroPedido = fechaRegistroPedido;
        this.estadoPedido = estadoPedido;
        this.prioridadPedido = prioridadPedido;
        this.fechaEntregaEstimadaPedido = fechaEntregaEstimadaPedido;
        this.materialIdMaterial = materialIdMaterial;
        this.clienteIdCliente = clienteIdCliente;
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }

    // Getters y Setters
    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long idPedido) { this.idPedido = idPedido; }

    public Date getFechaRegistroPedido() { return fechaRegistroPedido; }
    public void setFechaRegistroPedido(Date fechaRegistroPedido) { this.fechaRegistroPedido = fechaRegistroPedido; }

    public String getEstadoPedido() { return estadoPedido; }
    public void setEstadoPedido(String estadoPedido) { this.estadoPedido = estadoPedido; }

    public String getPrioridadPedido() { return prioridadPedido; }
    public void setPrioridadPedido(String prioridadPedido) { this.prioridadPedido = prioridadPedido; }

    public Date getFechaEntregaEstimadaPedido() { return fechaEntregaEstimadaPedido; }
    public void setFechaEntregaEstimadaPedido(Date fechaEntregaEstimadaPedido) { this.fechaEntregaEstimadaPedido = fechaEntregaEstimadaPedido; }

    public Long getMaterialIdMaterial() { return materialIdMaterial; }
    public void setMaterialIdMaterial(Long materialIdMaterial) { this.materialIdMaterial = materialIdMaterial; }

    public Long getClienteIdCliente() { return clienteIdCliente; }
    public void setClienteIdCliente(Long clienteIdCliente) { this.clienteIdCliente = clienteIdCliente; }

    public Long getEmpleadoIdEmpleado() { return empleadoIdEmpleado; }
    public void setEmpleadoIdEmpleado(Long empleadoIdEmpleado) { this.empleadoIdEmpleado = empleadoIdEmpleado; }
}