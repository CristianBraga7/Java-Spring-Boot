package br.cristian.exercicioss.model.repositores;

import org.springframework.data.repository.CrudRepository;

import br.cristian.exercicioss.model.entities.Produto;

public interface ProdutoRepositores 
extends CrudRepository<Produto, Integer> {
	

}
