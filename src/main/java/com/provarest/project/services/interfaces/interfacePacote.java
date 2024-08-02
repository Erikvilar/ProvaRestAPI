package com.provarest.project.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.provarest.project.entities.Pacote;

public interface interfacePacote {
    void atualizaStatus(Pacote pacote);
    List<Pacote> getPacotes();
    Optional<Pacote> getById(Long id);
    void deletePacote(Long id);
    void updateById(Long id, Pacote pacote);
}
