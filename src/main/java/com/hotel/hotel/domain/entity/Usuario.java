package com.hotel.hotel.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Rol> roles;
}
