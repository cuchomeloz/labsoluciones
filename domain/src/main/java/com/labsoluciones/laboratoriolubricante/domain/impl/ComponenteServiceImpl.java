package com.labsoluciones.laboratoriolubricante.domain.impl;

import com.labsoluciones.laboratoriolubricante.domain.aggregates.dto.EquipoDTO;
import com.labsoluciones.laboratoriolubricante.domain.aggregates.request.RequestComponente;
import com.labsoluciones.laboratoriolubricante.domain.ports.in.ComponenteServiceIn;
import com.labsoluciones.laboratoriolubricante.domain.ports.out.ComponenteServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComponenteServiceImpl implements ComponenteServiceIn {
    private final ComponenteServiceOut componenteServiceOut;

    @Override
    public EquipoDTO crearComponenteIn(RequestComponente requestComponente) {
        return componenteServiceOut.crearComponenteOut(requestComponente);
    }

    @Override
    public Optional<EquipoDTO> obtenerComponenteIn(Long id) {
        return componenteServiceOut.obtenerComponenteOut(id);
    }

    @Override
    public List<EquipoDTO> obtenerTodosIn() {
        return componenteServiceOut.obtenerTodosOut();
    }

    @Override
    public EquipoDTO actualizarIn(Long id, RequestComponente requestComponente) {
        return componenteServiceOut.actualizarOut(id, requestComponente);
    }

    @Override
    public EquipoDTO deleteIn(Long id) {
        return componenteServiceOut.deleteOut(id);
    }
}
