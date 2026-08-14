package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.TareaProduccion;

public interface TareaProduccionRepository extends JpaRepository<TareaProduccion, Long> {
}