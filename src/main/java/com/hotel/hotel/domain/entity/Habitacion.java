package com.hotel.hotel.domain.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="habitaciones")
public class Habitacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@NotEmpty
	String nombre;
	String descripcion;
	@NotEmpty
	TipoHabitacion tipoHabitacion;
	@NotEmpty
	TematicaHabitacion tematicaHabitacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public TematicaHabitacion getTematicaHabitacion() {
		return tematicaHabitacion;
	}

	public void setTematicaHabitacion(TematicaHabitacion tematicaHabitacion) {
		this.tematicaHabitacion = tematicaHabitacion;
	}
	

}
