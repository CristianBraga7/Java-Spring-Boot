package br.cristian.exercicioss.model.repositores;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.cristian.exercicioss.model.entities.Produto;

public interface ProdutoRepositores 
extends JpaRepository<Produto, String> {
	
	List<Produto> findByNome(String nome);
	

}
