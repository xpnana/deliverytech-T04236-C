package com.deliverytech.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery_api.model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByRestauranteId(Long id);
    /*boolean findByDisponivelTrue();*/
    List<Produto> findByDisponivelTrue();
    List<Produto> findByCategoria(String categoria);
}
