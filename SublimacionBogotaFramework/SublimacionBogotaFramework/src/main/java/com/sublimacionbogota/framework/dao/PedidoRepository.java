package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}