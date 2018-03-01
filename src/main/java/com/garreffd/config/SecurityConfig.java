package com.garreffd.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource securityDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/hangout/**").hasAuthority("INVITEE")
			.and()
			.formLogin()
			//https://stackoverflow.com/questions/24948651/spring-security-difference-between-and-url-pattern-in-spring-security
			.loginPage("/showLoginPage")
			.loginProcessingUrl("/authenticate")
			.permitAll() //Let everyone see the login page
			.and()
			.logout().permitAll();
	}
	
	
	
}
