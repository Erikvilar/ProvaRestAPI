package com.provarest.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.provarest.project.entities.Endereco;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

}
