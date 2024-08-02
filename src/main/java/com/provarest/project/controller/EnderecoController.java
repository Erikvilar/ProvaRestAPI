package com.provarest.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.provarest.project.entities.Endereco;
import com.provarest.project.services.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class EnderecoController {
    @Autowired 
    private EnderecoService enService;


    @GetMapping("enderecos")
    public List<Endereco> enderecos() {
        return enService.getEnderecoCompleto();
    }
    @PostMapping("enderecosSave")
    public void enderecosSave(@RequestBody Endereco endereco) {
        enService.save(endereco);
    }
    
}
