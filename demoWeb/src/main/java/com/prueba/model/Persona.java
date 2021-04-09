package com.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private int IdPersona;
    
	@Column(name = "nombre",length = 50)
	
	private String nombre;
	
	public int getIdPersona() {
		return IdPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
