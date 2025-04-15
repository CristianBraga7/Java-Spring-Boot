package br.cristian.exercicioss.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.cristian.exercicioss.model.entities.Cliente;

@RestController	
@RequestMapping("/clientes")
public class ClienteController {

   @GetMapping("/qualquer2")
	public Cliente obterCliente() {
	   return new Cliente(28, "Pedro", "123.456.124-89");
	}
   
   @GetMapping("/{id}")
   public Cliente obterClientePorId1(@PathVariable( name = "id") int id) {
	   return new Cliente(id, "maria", "987.654.321.00");
	   
   }
   
   public Cliente obterClientePorId2(@RequestParam int id) {
	   return new Cliente(id, "Joao Augusto", "111.222.321.00");
   }
}
