package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="formation")
public class Formation {
	
	@Id
	@Column (name= "formation_id ")
	private int formation_id ;
	
	@Column (name = "formationName  ")
	private String formationName  ;

	
	public int getFormation_id () {
		return formation_id ;
	}

	public void setFormation_id (int formation_id ) {
		this.formation_id  = formation_id ;
	}

	public String getFormationName  () {
		return formationName  ;
	}

	public void setFormationName  (String formationName  ) {
		this.formationName   = formationName  ;
	}

}
