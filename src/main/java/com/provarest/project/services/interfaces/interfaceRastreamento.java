package com.provarest.project.services.interfaces;


import java.util.Optional;

import com.provarest.project.entities.Rastreamento;

public interface interfaceRastreamento {
    
    Optional<Rastreamento> getResumo(Long id);
}
