package com.deliverytech.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery_api.model.Restaurante;

import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{
    List<Restaurante> findByCategoria(String categoria);
    List<Restaurante> findByAtivoTrue();
    List<Restaurante> findTop5ByOrderByNomeAsc(String nome);
}
