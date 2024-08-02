package com.provarest.project.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.provarest.project.entities.Rastreamento;
@Repository
public interface RastreamentoRepository extends CrudRepository<Rastreamento, Long>{
    
    Rastreamento update (Rastreamento rastreamento);
    Optional <Rastreamento> findById(Long id);



}
