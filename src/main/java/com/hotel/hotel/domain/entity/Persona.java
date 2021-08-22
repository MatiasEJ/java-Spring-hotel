/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.domain.entity;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
public abstract class Persona {

	long id;
	String nombre;
	String apellido;
	String dni;
	String direccion;
	Date fechaNacimiento;
	
	
}
