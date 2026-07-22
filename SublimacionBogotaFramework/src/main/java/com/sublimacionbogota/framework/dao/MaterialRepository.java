package com.sublimacionbogota.framework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sublimacionbogota.framework.modelo.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}