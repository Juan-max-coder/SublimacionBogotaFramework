package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Produccion;

public interface ProduccionRepository extends JpaRepository<Produccion, Long> {
}