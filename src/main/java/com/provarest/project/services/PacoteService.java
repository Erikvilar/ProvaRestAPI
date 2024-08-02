package com.provarest.project.services;



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
    try{
        pRepo.update(pacote);
    }catch(Exception ex){
        
    }

}






 
    
}
