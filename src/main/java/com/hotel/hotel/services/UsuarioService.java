package com.hotel.hotel.services;

import com.hotel.hotel.dao.UsuarioDao;
import com.hotel.hotel.domain.entity.Rol;
import com.hotel.hotel.domain.entity.Usuario;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
@Slf4j
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
//		var roles = new ArrayList<GrantedAuthority>();
//		for (Rol rol : usuario.getRoles()) {
//			roles.add(new SimpleGrantedAuthority(rol.getNombre()));
//		}
		
		var roles = usuario.getRoles()
				.stream()
				.map(rol-> new SimpleGrantedAuthority(rol.getNombre()))
				.peek(auth-> log.info("rol: "+auth.getAuthority()))
				.collect(Collectors.toList());

		return new User(usuario.getUsername(), usuario.getPassword(), roles);
	}

}
