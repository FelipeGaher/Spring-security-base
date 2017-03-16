package com.felipe.securitybasic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Require authentication to every URL in your application
	Generate a login form for you
	Allow the user with the Username user and the Password password to authenticate with form based authentication
	Allow the user to logout
	CSRF attack prevention
	Session Fixation protection
	Security Header integration
	
 * @author fgajardo
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth
			.inMemoryAuthentication()
				.withUser("admin")
					.password("password")
					.roles("ADMIN","USER")
					.and()
				.withUser("user")
					.password("user")
					.roles("USER");
	}
}
