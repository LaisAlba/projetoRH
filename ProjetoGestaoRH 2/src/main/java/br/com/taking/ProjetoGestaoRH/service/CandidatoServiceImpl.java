package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.repository.CandidatoRepository;

@Service
public class CandidatoServiceImpl implements CandidatoService {

	
	@Autowired
	CandidatoRepository candidatoRepository;
	

	@Override
	public List<Candidato> listarTodos() {
	
		return candidatoRepository.findAll();
	}

	@Override
	public Optional<Candidato> findById(int id) {
		return candidatoRepository.findById(id);
	}
}
