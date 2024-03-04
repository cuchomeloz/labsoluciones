package com.labsoluciones.laboratoriolubricante.domain.ports.in;

import com.labsoluciones.laboratoriolubricante.domain.aggregates.dto.EquipoDTO;
import com.labsoluciones.laboratoriolubricante.domain.aggregates.request.RequestComponente;

import java.util.List;
import java.util.Optional;

public interface ComponenteServiceIn {
    EquipoDTO crearComponenteIn(RequestComponente requestComponente);
    Optional<EquipoDTO> obtenerComponenteIn(Long id);
    List<EquipoDTO> obtenerTodosIn();
    EquipoDTO actualizarIn(Long id, RequestComponente requestComponente);
    EquipoDTO deleteIn(Long id);
}
