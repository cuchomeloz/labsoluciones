package com.labsoluciones.laboratoriolubricante.infraestructure.repository;

import com.labsoluciones.laboratoriolubricante.infraestructure.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
