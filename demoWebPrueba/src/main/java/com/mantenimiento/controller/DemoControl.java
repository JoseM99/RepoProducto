package com.mantenimiento.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mantenimiento.Model.Persona;
import com.mantenimiento.repositorio.IPersonas_Repositorio;

@Controller
public class DemoControl {
	
	@Autowired
	private IPersonas_Repositorio reposi;
	
	@RequestMapping("/pagina")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p =new Persona();
		p.setIdPersona(2);
		p.setNombre("Isabel Gutierrez");
		reposi.save(p);
				
		
		model.addAttribute("name", name);
		return "pagina";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		
		model.addAttribute("personas",reposi.findAll());
		return "pagina";
	}
}
