package com.provarest.project.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.provarest.project.entities.Rastreamento;
import com.provarest.project.services.RastreamentoService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class RastreamentoController {
    @Autowired
    private RastreamentoService raService;
    @GetMapping("rastreamentos/{id}")
    public Optional<Rastreamento> rastreamentos(@PathVariable Long id) {
        return raService.getResumo(id);
    }
    
    
}
