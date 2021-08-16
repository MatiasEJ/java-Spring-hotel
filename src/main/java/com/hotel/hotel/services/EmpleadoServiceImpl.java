/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.services;

import com.hotel.hotel.dao.IEmpleadoDao;
import com.hotel.hotel.domain.Empleado;
import com.hotel.hotel.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> listarEmpleados() {
		return (List<Empleado>) empleadoDao.findAll();
	}
	
	@Override
	@Transactional
	public void guardar(Empleado empleado) {
		empleadoDao.save(empleado);
	}
	
	@Override
	@Transactional
	public void eliminar(Empleado empleado) {
		empleadoDao.delete(empleado);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Empleado encontrarEmpleado(Empleado empleado) {
		return empleadoDao.findById(empleado.getId()).orElse(null);
	}
	
}
