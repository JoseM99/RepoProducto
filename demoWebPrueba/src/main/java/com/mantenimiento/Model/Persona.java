package com.mantenimiento.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@JsonSerialize
public class Persona {
@Id
private int idPersona;

@Column(name="nombre",length = 50)
private String nombre;

	public int getIdPersona() {
		return idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 	
}
