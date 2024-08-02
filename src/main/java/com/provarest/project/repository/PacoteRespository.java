package com.provarest.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.provarest.project.entities.Pacote;
@Repository
public interface PacoteRespository extends CrudRepository<Pacote, Long> {


    void update (Pacote pacote);

}
