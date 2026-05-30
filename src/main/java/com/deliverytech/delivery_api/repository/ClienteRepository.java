package com.deliverytech.delivery_api.repository;

import com.deliverytech.delivery_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Long, Cliente> {
    Cliente findNome(String nome);
} 
    

