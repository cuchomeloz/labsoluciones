package com.labsoluciones.laboratoriolubricante.infraestructure.repository;

import com.labsoluciones.laboratoriolubricante.infraestructure.entity.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Long> {
}
