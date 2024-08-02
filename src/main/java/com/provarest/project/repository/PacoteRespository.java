package com.provarest.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.provarest.project.entities.Pacote;

@Repository
public interface PacoteRespository extends CrudRepository<Pacote, Long> {


    List<Pacote> findAll();
    Optional <Pacote> findById(Long id);
    void deleteById(Long id);
    Pacote save (Pacote pacote);
   

}
