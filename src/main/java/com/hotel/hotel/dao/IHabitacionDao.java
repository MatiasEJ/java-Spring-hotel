/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.dao;

import com.hotel.hotel.domain.entity.Habitacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
public interface IHabitacionDao extends CrudRepository<Habitacion, Long> {
	
}
