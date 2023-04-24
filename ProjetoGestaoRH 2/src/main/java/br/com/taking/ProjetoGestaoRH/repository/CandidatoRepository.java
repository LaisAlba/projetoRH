package br.com.taking.ProjetoGestaoRH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.taking.ProjetoGestaoRH.model.Candidato;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{

    @Query("select c from Candidato c where c.candidato_id = :id or  c.firstName = :fistName or c.lastName = :lastName or c.birthdate = :birthdate")
    List<Candidato> filter(int id, String fistName, String lastName, Date birthdate);
}