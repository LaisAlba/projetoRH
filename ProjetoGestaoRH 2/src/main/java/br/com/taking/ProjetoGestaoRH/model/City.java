package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="city")

public class City {
	
	
	@Id
	@Column (name= "city_id")
	private int city_id;
	
	@Column (name = "city")
	private String city ;

		
	@ManyToOne
	@JoinColumn(name= "state_id")
	private State state;
		
	
	public int getCity_id () {
		return city_id;
	}

	public void setCity_id (int city_id) {
		this.city_id  = city_id ;
	}

	public String getCity () {
		return city;
	}

	public void setCity (String city) {
		this.city  = city;
	}

}
