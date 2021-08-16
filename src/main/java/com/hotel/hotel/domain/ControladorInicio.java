package com.hotel.hotel.domain;

import com.hotel.hotel.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/")
	public String index(Model model) {
		var personas = empleadoService.listarEmpleados();
		model.addAttribute("listaPersonas", personas);
		return "index";

	}

}
