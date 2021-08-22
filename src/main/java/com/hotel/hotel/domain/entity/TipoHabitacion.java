/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.hotel.domain.entity;

/**
 *
 * @author Matias Ezequiel Juncos.
 */
public enum TipoHabitacion {
	SINGLE,
	DOBLE,
	TRIPLE,
	MULTIPLE;

	@Override
	public String toString() {
		switch(this){
			case SINGLE ->{ return "Single";}
			case DOBLE -> {return "Doble";}
			case TRIPLE -> {return "Triple";}
			case MULTIPLE -> {return "Multiple";}
			default -> {
				return "";
			}
		}
	}
}
