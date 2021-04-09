package com.prueba.reposi;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona,Integer>{

}
