package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}