package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import java.util.Optional;


import br.com.taking.ProjetoGestaoRH.model.Candidato;

public interface CandidatoService {

	List<Candidato> listarTodos();


	Optional<Candidato> findById(int id);

}