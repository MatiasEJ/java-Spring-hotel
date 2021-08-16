package com.hotel.hotel.dao;

import com.hotel.hotel.domain.Empleado;
import com.hotel.hotel.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface IEmpleadoDao extends CrudRepository<Empleado, Long>  {
	
}
