package com.labsoluciones.laboratoriolubricante.domain.ports.out;

import com.labsoluciones.laboratoriolubricante.domain.aggregates.dto.EquipoDTO;
import com.labsoluciones.laboratoriolubricante.domain.aggregates.request.RequestComponente;

import java.util.List;
import java.util.Optional;

public interface ComponenteServiceOut {
    EquipoDTO crearComponenteOut(RequestComponente requestComponente);
    Optional<EquipoDTO> obtenerComponenteOut(Long id);
    List<EquipoDTO> obtenerTodosOut();
    EquipoDTO actualizarOut(Long id, RequestComponente requestComponente);
    EquipoDTO deleteOut(Long id);
}
