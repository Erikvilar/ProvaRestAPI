package com.provarest.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.provarest.project.entities.Endereco;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
    List<Endereco> findAll();
    Endereco save(Endereco endereco);
}
