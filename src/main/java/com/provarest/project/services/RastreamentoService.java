package com.provarest.project.services;



import org.springframework.beans.factory.annotation.Autowired;

import com.provarest.project.entities.Rastreamento;
import com.provarest.project.repository.RastreamentoRepository;
import com.provarest.project.services.interfaces.interfaceRastreamento;

public class RastreamentoService implements interfaceRastreamento{
    @Autowired
    private RastreamentoRepository rRepo;
    @Override
    public void atualizaStatus(Rastreamento rastreamento) {
            try{
                rRepo.update(rastreamento);
            }catch(Exception ex){
                throw new UnsupportedOperationException("Unimplemented method 'atualizaStatus'");
            }
     
    }


}
