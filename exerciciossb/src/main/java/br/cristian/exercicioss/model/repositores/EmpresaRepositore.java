package br.cristian.exercicioss.model.repositores;



import org.springframework.data.jpa.repository.JpaRepository;

import br.cristian.exercicioss.model.entities.Empresa;

public interface EmpresaRepositore 
extends JpaRepository<Empresa, String> {
}