package com.hotel.hotel.domain.controller;

import com.hotel.hotel.domain.entity.Empleado;
import com.hotel.hotel.services.EmpleadoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladoraEmpleado {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listarEmpleados")
	public String listarEmpleados(Model model) {
		List<Empleado> empleados = empleadoService.listarEmpleados();
		model.addAttribute("listaEmpleados", empleados);
		return "empleados";
	}

	@GetMapping("/agregarEmpleado")
	public String agregarEmpleado(Empleado empleado) {
		return "editarEmpleado";
	}
	@PostMapping("/guardarEmpleado")
	public String guardarEmpleado(@Valid Empleado empleado, Errors errors) {
		if(errors.hasErrors()){
			return "editarEmpleado";
		}
		empleadoService.guardar(empleado);
		return "redirect:/";
	}
	@GetMapping("/editarEmpleado/{id}")
	public String editarEmpleado(Empleado empleado,Model model) {
		empleado = empleadoService.encontrarEmpleado(empleado);
		model.addAttribute("empleado", empleado);
		return "editarEmpleado";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(Empleado empleado) {
		empleadoService.eliminar(empleado);
		return "redirect:/";
	}

}
