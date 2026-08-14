package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Cliente;

/**
 * Repositorio que reemplaza el ClienteDAO tradicional.
 * JpaRepository provee automáticamente métodos CRUD.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}