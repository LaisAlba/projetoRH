package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="languages_skill")


public class Languages_skill {
	
	@Id
	@Column (name= "languagesskill_id ")
	private int languagesskill_id ;
		
	@ManyToOne
	@JoinColumn(name= "language_id")
	private Languages languages;
	
	@ManyToOne
	@JoinColumn(name= "level_id")
	private Level level;
	
	@ManyToOne 
	@JoinColumn(name= "candidato_id")
	private Candidato candidato;

	public int getLanguagesskill_id() {
		return languagesskill_id;
	}

	public void setLanguagesskill_id(int languagesskill_id) {
		this.languagesskill_id = languagesskill_id;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	

	

}
