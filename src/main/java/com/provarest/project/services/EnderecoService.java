package com.provarest.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provarest.project.entities.Endereco;
import com.provarest.project.repository.EnderecoRepository;
import com.provarest.project.services.interfaces.interfaceEndereco;

@Service
public class EnderecoService implements interfaceEndereco{
    @Autowired
    private EnderecoRepository enRepo;

    @Override
    public List<Endereco> getEnderecoCompleto() {
        return enRepo.findAll();
    }

    @Override
    public Endereco save(Endereco endereco) {
            return enRepo.save(endereco);
    }


}
