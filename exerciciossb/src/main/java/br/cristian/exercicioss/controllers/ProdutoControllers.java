package br.cristian.exercicioss.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.cristian.exercicioss.model.entities.Produto;
import br.cristian.exercicioss.model.repositores.ProdutoRepositores;
 
@RestController
@RequestMapping("produtos")
public class ProdutoControllers {
	
	@Autowired
	private ProdutoRepositores produtoRepositores;
	
	public ProdutoControllers(ProdutoRepositores produtoRepositores) {
		this.produtoRepositores = produtoRepositores;
	}
	
	 @PostMapping
		public Produto salvar(@RequestBody Produto produto){
			System.out.println("Produto cadastrado" + produto);
			
			String id = UUID.randomUUID().toString();
	        produto.setId(id);
		
		produtoRepositores.save(produto);
		return produto;
	 }
		@GetMapping("{id}")
	    public Produto obterPorID(@PathVariable("id") String id) {
	    	return produtoRepositores.findById(id).orElse(null);	 
	}
}

   
	
    
    	
    
    
