package com.generation.jtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.jtech.model.Categoria;
import com.generation.jtech.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeProdutoContainingIgnoreCase(@Param("nomeProduto") String produto);
}
