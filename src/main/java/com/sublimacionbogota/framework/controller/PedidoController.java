package com.sublimacionbogota.framework.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sublimacionbogota.framework.dao.PedidoRepository;
import com.sublimacionbogota.framework.modelo.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // READ
    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    // CREATE
    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Pedido actualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        pedido.setIdPedido(id);
        return pedidoRepository.save(pedido);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}