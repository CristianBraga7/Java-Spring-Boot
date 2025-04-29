package br.cristian.exercicioss.controllers;

import br.cristian.exercicioss.model.entities.Empresa;
import br.cristian.exercicioss.model.repositores.EmpresaRepositore;
import br.cristian.exercicioss.model.repositores.ProdutoRepositores;

import java.util.UUID;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("empresa")
public class EmpresaController {
	
	private EmpresaRepositore empresaRepositore;

	public EmpresaController(EmpresaRepositore empresaRepositore) {
		this.empresaRepositore = empresaRepositore;
	}

	@PostMapping
    public Empresa salvar(@RequestBody Empresa empresa) {
    	System.out.println("Empresa Cadastrada: " + empresa);
    	
    	String id = UUID.randomUUID().toString();
    	empresa.setId(id);
    	
    	empresaRepositore.save(empresa);
    	return empresa;
	}
    	@GetMapping("{id}")
    	public Empresa ObterPorId(@PathVariable("id") String id) {
    		return empresaRepositore.findById(id).orElse(null);
    	}
<<<<<<< HEAD
    }
=======
    }

  
>>>>>>> 9f590c314dad0f83ee2187ef478d718b3ebe4a0a
