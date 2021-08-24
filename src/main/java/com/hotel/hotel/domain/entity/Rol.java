package com.hotel.hotel.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nombre;
}
