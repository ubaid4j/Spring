package com.ubaid.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import com.ubaid.app.Roles;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		
		@SuppressWarnings("deprecation")
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.
			inMemoryAuthentication()
				.withUser(users.username("ubaid").password("1234").roles(Roles.ADMIN, Roles.EMPLOOYE, Roles.MANAGER))
				.withUser(users.username("attiq").password("1234").roles(Roles.EMPLOOYE, Roles.MANAGER).build())
				.withUser(users.username("hajra").password("1234").roles(Roles.EMPLOOYE).build());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{

		http
			.authorizeRequests()
			.antMatchers("/static/**") //these three lines give a authorization to load from static/** URL
			.permitAll()			

			.antMatchers("/manager/**").hasRole(Roles.MANAGER)  //these two lines setting role to manager url and admin role
			.antMatchers("/admin/**").hasRole(Roles.ADMIN)

			.anyRequest()           //now any request should be authenticated
			.authenticated()													//original one

			.and()                  //binding
			
			.formLogin()			//asking for login from 
			.loginPage("/login")
			.loginProcessingUrl("/loginProcessing")
			
			.permitAll()			//optional, when authenticated then permitting
			.and()
			.logout()		//then logout and giving permission to logout
			.permitAll()
			
			.and()
			.exceptionHandling()
			.accessDeniedPage("/accessDeniedPage");
/**		
		http
			.authorizeRequests()
			.antMatchers("/static/atapata/**").permitAll()
			.antMatchers("/admin/**").hasRole(Roles.ADMIN)
			.antMatchers("/manager/**").hasRole(Roles.MANAGER)
			.antMatchers("/login*").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/loginProcessing")
			.and()
			.logout();
**/				
			
	}
	
}
