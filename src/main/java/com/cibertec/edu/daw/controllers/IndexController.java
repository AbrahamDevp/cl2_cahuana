package com.cibertec.edu.daw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.edu.daw.models.Personal;
import com.cibertec.edu.daw.services.PersonalService;



@Controller
@RequestMapping("/home")
public class IndexController {

	@Autowired
	private PersonalService personalService;
	
	@Value("${index.titulo.text}")
	private String titulo;
	
	@GetMapping({"/index","/","","/home"})
	public String index(@RequestParam(name = "codigo", required = false) String codigo, Model model) {
		model.addAttribute("titulo",titulo);

		List<Personal> personales;
		if (codigo != null) {
			personales = personalService.getPersonalesByCodigoArea(codigo);
		} else {
			personales = personalService.getAllPersonals();
		}

		model.addAttribute("personales", personales);

		return "index";
	}
	
	@ModelAttribute("personales")
	public List<Personal> obtenerPersonales(){
	    List<Personal> personales = personalService.getAllPersonals(); 
	    return personales;
	}
}
