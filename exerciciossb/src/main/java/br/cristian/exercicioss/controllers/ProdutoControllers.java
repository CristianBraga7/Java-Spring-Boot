package br.cristian.exercicioss.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.cristian.exercicioss.model.entities.Produto;
import br.cristian.exercicioss.model.repositores.ProdutoRepositores;
 
@RestController
@RequestMapping("/api/produtos")
public class ProdutoControllers {
	
	@Autowired
	private ProdutoRepositores produtoRepositores;
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		
		produtoRepositores.save(produto);
		return produto;
	}
}
