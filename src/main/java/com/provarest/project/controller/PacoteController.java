package com.provarest.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.provarest.project.entities.Pacote;
import com.provarest.project.services.PacoteService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class PacoteController {
    @Autowired
    private PacoteService paService;

    @GetMapping("pacotes")
    public List<Pacote> pacotes() {
        return paService.getPacotes();
    }
    
    @PostMapping("savePacotes")
    public void postPacote(@RequestBody Pacote pacote) {
      paService.atualizaStatus(pacote);
    }
    @PutMapping("atualizaPacote/{id}")
    public void putMethodName(@PathVariable Long id, @RequestBody Pacote pacote) {
         paService.updateById(id, pacote);
    }
    @DeleteMapping("deletePacote/{id}")
    public void deletePacote(@PathVariable Long id){
        paService.deletePacote(id);
    }
    
    
}

