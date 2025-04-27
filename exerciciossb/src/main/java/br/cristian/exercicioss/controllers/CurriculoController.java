package br.cristian.exercicioss.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.cristian.exercicioss.model.entities.Curriculo;
import br.cristian.exercicioss.model.repositores.CurriculoRepositore;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/curriculo")
public class CurriculoController {
	
	
		
		@Autowired
		private CurriculoRepositore curriculoRepositores;
		
		@PostMapping
		public @ResponseBody Curriculo novoCurriculo(@RequestParam String nome) {
			Curriculo curriculo = new Curriculo(nome);
			
			curriculoRepositores.save(curriculo);
			return curriculo;
		}
	}



