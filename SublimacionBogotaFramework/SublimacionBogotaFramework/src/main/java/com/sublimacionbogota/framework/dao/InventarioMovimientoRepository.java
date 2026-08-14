package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.InventarioMovimiento;

public interface InventarioMovimientoRepository extends JpaRepository<InventarioMovimiento, Long> {
}