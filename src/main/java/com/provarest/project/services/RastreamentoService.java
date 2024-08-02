package com.provarest.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provarest.project.entities.Rastreamento;
import com.provarest.project.repository.RastreamentoRepository;
import com.provarest.project.services.interfaces.interfaceRastreamento;
@Service
public class RastreamentoService implements interfaceRastreamento {
    @Autowired
    private RastreamentoRepository rRepo;

    @Override
    public Optional<Rastreamento> getResumo(Long id) {
        try {
            return rRepo.findById(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }
}