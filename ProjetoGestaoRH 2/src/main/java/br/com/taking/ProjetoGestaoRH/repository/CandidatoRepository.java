package br.com.taking.ProjetoGestaoRH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.taking.ProjetoGestaoRH.model.Candidato;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{

    @Query("select c from Candidato c where DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') >= :age1 " +
            "and DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') <= :age2 " +
            "and DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') <= 35 " +
            "and DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') >= 18")
    List<Candidato> filterAges(int age1, int age2);


    @Query("select c from Candidato c where DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') = :age")
    List<Candidato> filterDate(int age);

}