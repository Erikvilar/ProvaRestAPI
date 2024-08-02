package com.provarest.project.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
@Table(name="Pacotes")
public class Pacote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id_pacote;
    private String id;
    private String destinatario;
    @OneToMany(mappedBy = "Pacote")
    private Rastreamento rastreamento;

    

 
     


}
