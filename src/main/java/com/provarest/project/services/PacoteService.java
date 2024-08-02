package com.provarest.project.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provarest.project.entities.Pacote;
import com.provarest.project.repository.PacoteRespository;
import com.provarest.project.services.interfaces.interfacePacote;
@Service
public class PacoteService implements interfacePacote {

 @Autowired
 private PacoteRespository pRepo;

@Override
public void atualizaStatus(Pacote pacote) {
pRepo.save(pacote);
}

@Override
public List<Pacote> getPacotes() {
 return pRepo.findAll();
}

@Override
public Optional<Pacote> getById(Long id) {
    return pRepo.findById(id);
}

@Override
public void deletePacote(Long id) {

}

@Override
public void updateById(Long id, Pacote pacote) {
       Long idPacote = pacote.getId_pacote();
       pacote.setId_pacote(idPacote);
        pRepo.save(pacote);
}


}






 
    

