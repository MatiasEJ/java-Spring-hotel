package com.hotel.hotel.dao;

import com.hotel.hotel.domain.entity.Empleado;
import org.springframework.data.repository.CrudRepository;


public interface IEmpleadoDao extends CrudRepository<Empleado, Long>  {
	
}
