/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.services.impl;

import com.hotel.hotel.dao.IHabitacionDao;
import com.hotel.hotel.domain.entity.Habitacion;
import com.hotel.hotel.services.HabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
@Service
public class HabitacionServiceImpl implements HabitacionService {

	@Autowired
	private IHabitacionDao habitacionDao;

	@Override
	@Transactional(readOnly = true)
	public List<Habitacion> findAllHabitacion() {
		return (List<Habitacion>) habitacionDao.findAll();
	}

	@Override
	@Transactional
	public void agregar(Habitacion habitacion) {
		habitacionDao.save(habitacion);
	}

	@Override
	@Transactional
	public void eliminar(Habitacion habitacion) {
		habitacionDao.delete(habitacion);
	}

	@Override
	@Transactional(readOnly = true)
	public Habitacion findHabitacion(Habitacion habitacion) {
		return habitacionDao.findById(habitacion.getId()).orElse(null);
	}
	
}
