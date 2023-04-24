package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table (name="level")

public class Level {
	
	@Id
	@Column (name= "level_id ")
	private int level_id ;
	
	@Column (name = "levelName ")
	private String levelName ;
	
	

	public int getLevel_id () {
		return level_id ;
	}

	public void setLevel_id (int level_id ) {
		this.level_id  = level_id ;
	}

	public String getLevelName () {
		return levelName ;
	}

	public void setLevelName (String levelName ) {
		this.levelName  = levelName ;
	}
	

}
