package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}