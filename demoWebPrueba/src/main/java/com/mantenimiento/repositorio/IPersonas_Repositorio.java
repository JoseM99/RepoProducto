package com.mantenimiento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantenimiento.Model.Persona;

public interface IPersonas_Repositorio extends JpaRepository<Persona,Integer> {

}
