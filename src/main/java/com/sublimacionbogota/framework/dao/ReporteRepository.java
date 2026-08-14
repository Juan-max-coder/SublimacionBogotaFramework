package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Reporte;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
}