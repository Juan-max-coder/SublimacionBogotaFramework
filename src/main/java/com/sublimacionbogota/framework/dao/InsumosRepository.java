package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Insumos;

public interface InsumosRepository extends JpaRepository<Insumos, Long> {
}