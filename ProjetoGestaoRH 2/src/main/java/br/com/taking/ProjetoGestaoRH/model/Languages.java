package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="languages")

public class Languages {
	
	@Id
	@Column (name= "language_id ")
	private int language_id ;
	
	@Column (name = "language")
	private String language;
	
	

	public int getLanguage_id () {
		return language_id ;
	}

	public void setLanguage_id (int language_id ) {
		this.language_id  = language_id ;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
