/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.services;

import com.hotel.hotel.domain.entity.Habitacion;
import java.util.List;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
public interface HabitacionService {
	public List<Habitacion> findAllHabitacion();	
	public void agregar(Habitacion habitacion);
	public void eliminar(Habitacion habitacion);
	public Habitacion findHabitacion(Habitacion habitacion);
}
