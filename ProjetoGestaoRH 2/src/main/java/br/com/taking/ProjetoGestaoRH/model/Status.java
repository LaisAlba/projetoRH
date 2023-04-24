package br.com.taking.ProjetoGestaoRH.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table (name="status")


public class Status {
	
	@Id
	@Column (name= "status_id  ")
	private int status_id  ;
	
	@Column (name = "statusName ")
	private String statusName ;
		

	

	public int getStatus_id  () {
		return status_id  ;
	}

	public void setStatus_id  (int status_id  ) {
		this.status_id   = status_id  ;
	}

	public String getStatusName () {
		return statusName ;
	}

	public void setStatusName (String statusName ) {
		this.statusName  = statusName ;
	}

}
