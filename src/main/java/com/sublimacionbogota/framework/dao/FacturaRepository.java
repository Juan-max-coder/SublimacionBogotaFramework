package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}