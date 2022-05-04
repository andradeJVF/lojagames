package com.generation.games.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.games.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{

	public List <Produto> findAllByConsoleContainingIgnoreCase(@Param("console")String console);
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}