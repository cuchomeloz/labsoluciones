package com.labsoluciones.laboratoriolubricante.infraestructure.repository;

import com.labsoluciones.laboratoriolubricante.infraestructure.entity.ComponenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponenteRepository extends JpaRepository<ComponenteEntity, Long> {
}
