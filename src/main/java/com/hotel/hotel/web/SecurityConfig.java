package com.hotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("admin")
				.password("{noop}123")
				.roles("ADMIN", "USER")
				.and()
				.withUser("user")
				.password("{noop}123")
				.roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/editarEmpleado/**",
						"/agregarEmpleado/**",
						"/eliminar")
					.hasRole("ADMIN")	
				.antMatchers("/","/listarEmpleados")
					.hasAnyRole("ADMIN","USER")
				.and()
					.formLogin()
					.loginPage("/login")
				.and()
					.exceptionHandling()
					.accessDeniedPage("/errors/403");

	}



	

}
