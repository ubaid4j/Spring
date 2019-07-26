package com.ubaid.app.config.sec;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter
{

	@Autowired
	DataSource ds;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{

		//in memory password storage
//		@SuppressWarnings("deprecation")
//		UserBuilder builder = User.withDefaultPasswordEncoder();
//		
//		auth
//			.inMemoryAuthentication().withUser(builder.username("ubaid").password("1234").roles("ADMIN").build())
//									.withUser(builder.username("attiq").password("123").roles("EMPLOYEE").build())
//									.withUser(builder.username("hajar").password("1234").roles("MANAGER").build());
		
		
		auth.jdbcAuthentication().dataSource(ds);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
	
		
		//using this config, we can authenticate with any users and its password
/**
			http
				.authorizeRequests()
				.antMatchers("/api/customers/**")
				.authenticated()
				.and()
				.httpBasic()
				.and()
				.csrf()
				.disable()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
				
**/
		
		//using this config, we can authenticate only with ADMIN role users
/**
		http
			.authorizeRequests()
			.antMatchers("/api/customers/**").hasRole("ADMIN")
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic()
			.and()
			.csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
**/		
		//now the following config fullfill this requirement
		/**
		EMPLOYEE role can perform following
		1. Get a list of all customers. GET /api/customers
		2. Get a single customer. GET /api/customers/{customerId}
		MANAGER role can perform following
		1. Add a new customer. POST /api/customers
		2. Update an existing customer. PUT /api/customers
		ADMIN role can perform following
		1. Delete a customer. DELETE /api/customers/{customerId}
		**/
		
		http
			.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/api/customers").hasRole("EMPLOYEE")
			.antMatchers(HttpMethod.GET, "/api/customers/**").hasRole("EMPLOYEE")
			.antMatchers(HttpMethod.POST, "/api/customers").hasRole("MANAGER")
			.antMatchers(HttpMethod.PUT, "/api/customers").hasRole("MANAGER")
			.antMatchers(HttpMethod.DELETE, "/api/customers/**").hasRole("ADMIN")
			.and()
			.httpBasic()
			.and()
			.csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
}
