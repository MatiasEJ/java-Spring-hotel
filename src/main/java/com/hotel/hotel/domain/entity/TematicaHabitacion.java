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
public enum TematicaHabitacion {
	SELVA,
	ASIA,
	AMAZONAS;

	@Override
	public String toString() {
		return switch (this) {
			case SELVA ->
				"Selva";
			case ASIA ->
				"Asia";
			case AMAZONAS ->
				"Amazonas";
			default ->
				"";
		};
	}
}
