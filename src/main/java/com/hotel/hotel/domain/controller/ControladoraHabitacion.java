/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.domain.controller;

import com.hotel.hotel.domain.entity.Habitacion;
import com.hotel.hotel.services.HabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
@Controller
public class ControladoraHabitacion {

	@Autowired
	private HabitacionService habitacionService; 

	@GetMapping("/habitaciones")
	public String listaHabitaciones(Model model){
		List<Habitacion> listaHabitaciones = habitacionService.findAllHabitacion();
		model.addAttribute("listaHabitaciones", listaHabitaciones);
		return "habitaciones";
	}
	
}
