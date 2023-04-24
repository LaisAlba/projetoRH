package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="country_Origin")
public class Country_Origin {
	
	
	@Id
	@Column (name= "countryOfOrigin_id")
	private int countryOfOrigin_id;
	
	@Column (name = "countryOfOrigin ")
	private String countryOfOrigin ;
	
	

	public int getCountryOfOrigin_id() {
		return countryOfOrigin_id;
	}

	public void setCountryOfOrigin_id(int countryOfOrigin_id) {
		this.countryOfOrigin_id = countryOfOrigin_id;
	}

	public String getCountryOfOrigin () {
		return countryOfOrigin ;
	}

	public void setCountryOfOrigin(String countryOfOrigin ) {
		this.countryOfOrigin  = countryOfOrigin;
	}
	
	

}
