package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="institution")

public class Institution {
	
	@Id
	@Column (name= "institution_id ")
	private int institution_id ;
	
	@Column (name = "institutionName ")
	private String institutionName ;
	
	

	public int getInstitution_id () {
		return institution_id ;
	}

	public void setInstitution_id (int institution_id ) {
		this.institution_id  = institution_id ;
	}

	public String getInstitutionName () {
		return institutionName ;
	}

	public void setInstitutionName (String institutionName ) {
		this.institutionName  = institutionName ;
	}

}
