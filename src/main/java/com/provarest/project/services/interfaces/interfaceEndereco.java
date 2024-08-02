package com.provarest.project.services.interfaces;

import java.util.List;

import com.provarest.project.entities.Endereco;

public interface interfaceEndereco {
   List<Endereco> getEnderecoCompleto();
    Endereco save(Endereco endereco);
}
