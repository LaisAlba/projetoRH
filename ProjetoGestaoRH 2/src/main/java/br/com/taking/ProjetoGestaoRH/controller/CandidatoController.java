package br.com.taking.ProjetoGestaoRH.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import br.com.taking.ProjetoGestaoRH.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.service.CandidatoService;



@RestController
public class CandidatoController {
	
	@Autowired
	CandidatoService candidatoService;
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	@RequestMapping(value= "/candidato", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> GetALL(){
		
		List<Candidato> resultado = candidatoService.listarTodos();
		return new ResponseEntity<List<Candidato>> (resultado, HttpStatus.OK);

		
	}

	@RequestMapping(value = "/candidato/{candidato_id}", method = RequestMethod.GET)
	public ResponseEntity<Candidato> GetById(@PathVariable(value = "candidato_id") int id) {

		Optional<Candidato> result = candidatoService.findById(id);

		return result.map(candidato -> new ResponseEntity<>(candidato, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@RequestMapping(value = "/candidato/filter", method = RequestMethod.GET)
	public  List<Candidato> Filter(@RequestBody Candidato filter) {

		return candidatoRepository.filter(filter.getCandidato_id(), filter.getFirstName(),
				filter.getLastName(), filter.getBirthdate());
	}
}