package br.cristian.exercicioss.model.repositores;


import org.springframework.data.repository.CrudRepository;

import br.cristian.exercicioss.model.entities.Empresa;

public interface EmpresaRepositore 
extends CrudRepository<Empresa, Integer> {
}