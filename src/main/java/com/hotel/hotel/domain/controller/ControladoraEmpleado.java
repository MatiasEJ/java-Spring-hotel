package com.hotel.hotel.domain.controller;

import com.hotel.hotel.domain.entity.Empleado;
import com.hotel.hotel.services.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladoraEmpleado {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/")
	public String listarEmpleados(Model model) {
		List<Empleado> empleados = empleadoService.listarEmpleados();
		model.addAttribute("listaEmpleados", empleados);
		return "index";
	}

	@GetMapping("/agregarEmpleado")
	public String agregar(Empleado empleado) {
		return "editar";
	}
	@PostMapping("/guardar")
	public String guardar(Empleado empleado) {
		empleadoService.guardar(empleado);
		return "redirect:/";
	}
	@GetMapping("/editar/{id}")
	public String editar(Empleado empleado,Model model) {
		empleado = empleadoService.encontrarEmpleado(empleado);
		model.addAttribute("empleado", empleado);
		return "editar";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(Empleado empleado) {
		empleadoService.eliminar(empleado);
		return "redirect:/";
	}

}
