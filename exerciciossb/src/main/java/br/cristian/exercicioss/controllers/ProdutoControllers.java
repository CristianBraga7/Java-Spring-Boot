package br.cristian.exercicioss.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//to add
	 @PostMapping
		public Produto salvar(@RequestBody Produto produto){
			System.out.println("Produto cadastrado" + produto);
			
			String id = UUID.randomUUID().toString();
	        produto.setId(id);
		
		produtoRepositores.save(produto);
		return produto;
	 }
	   //search by id
		@GetMapping("{id}")
	    public Produto obterPorID(@PathVariable("id") String id) {
	    	return produtoRepositores.findById(id).orElse(null);	 
	}
		//delete
		@DeleteMapping("{id}")
		public void deletar(@PathVariable("id")String id) {
			produtoRepositores.deleteById(id);
		}
		
		//to update
		@PutMapping("{id}")
		public void atualizar(@PathVariable("id") String id, 
				              @RequestBody Produto produto) {
			produto.setId(id);
			produtoRepositores.save(produto);	
		}
		
		//search
		@GetMapping
		public List<Produto> buscar(@RequestParam("nome") String nome){
			return produtoRepositores.findByNome(nome);
		}
}

   
	
    
    	
    
    
