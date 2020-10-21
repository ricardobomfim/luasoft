package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {
	
	
	Cozinha buscar(Long id);	
	Cozinha salvar(Cozinha cozinha);
	List<Cozinha> listar();
//	void remover(Cozinha cozinha);
	void remover(Long id);

}
