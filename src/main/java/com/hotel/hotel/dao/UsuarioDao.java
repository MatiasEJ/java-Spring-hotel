package com.hotel.hotel.dao;

import com.hotel.hotel.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Long> {
	Usuario findByUsername(String username);
}
