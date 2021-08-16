/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String nombre;
	String apellido;
	String dni;
	String direccion;
	
}
