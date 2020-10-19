package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {
	
	
	Cozinha buscar(Long id);	
	void remover(Cozinha cozinha);	
	Cozinha salvar(Cozinha cozinha);
	List<Cozinha> listar();

}
