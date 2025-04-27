package br.cristian.exercicioss.controllers;

import br.cristian.exercicioss.model.entities.Empresa;
import br.cristian.exercicioss.model.repositores.EmpresaRepositore;

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
    public Empresa salvar (@RequestBody Empresa empresa) {
    	System.out.println("Empresa Cadastrada: " + empresa);
    	
    	var cod_empresa = UUID.randomUUID().toString();
    	empresa.setCod_empresa(cod_empresa);
    	empresaRepositore.save(empresa);
    	return empresa;

    }
}
  