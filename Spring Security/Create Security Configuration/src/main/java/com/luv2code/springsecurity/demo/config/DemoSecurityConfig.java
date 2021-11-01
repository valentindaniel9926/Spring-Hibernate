package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("valentin").password("topsecret123").roles("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("daniel").password("topsecret123").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("andrew").password("topsecret123").roles("ADMIN");
	}	
	
}