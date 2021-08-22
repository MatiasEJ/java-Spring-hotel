/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.domain.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
@Data
@Entity
@Table(name="empleados")
public class Empleado implements Serializable{
	private static final long serialVersionUID = 1L;
 	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@NotEmpty	
	String nombre;
	@NotEmpty	
	String apellido;
	@NotEmpty	
	String dni;
	@NotEmpty	
	String direccion;
	
}
