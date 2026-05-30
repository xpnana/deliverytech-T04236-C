package com.deliverytech.delivery_api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String  telefone;
    private String endereco;
    private LocalDateTime dataCadastro;
    private Boolean ativo;
    
}
    