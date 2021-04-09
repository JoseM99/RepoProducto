package com.prueba.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.model.Persona;
import com.prueba.reposi.IPersonaRepo;

@Controller
public class DemoController {
	@Autowired
	private IPersonaRepo repo;

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona(3);
		p.setNombre("isabel");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	 
	
	 
}
