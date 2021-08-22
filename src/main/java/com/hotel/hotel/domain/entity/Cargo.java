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
public enum Cargo {
	GERENTE,
	ADMIN,
	DATAENTRY;

	@Override
	public String toString() {
		return switch (this) {
			case GERENTE -> "Gerente";
			case ADMIN -> "Administrador";
			case DATAENTRY -> "Data-Entry";
			default -> "";
		};
	}
	
}
