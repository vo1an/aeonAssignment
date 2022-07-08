package com.virakvoan.demo.cotroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration  
public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {  
  
    @Override  
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()
          .authorizeRequests()
          .antMatchers(HttpMethod.GET, "/api/positions").permitAll()
          .and()
          .authorizeRequests()
          .antMatchers(HttpMethod.POST, "/api/positions").hasRole("USER")
          .anyRequest().authenticated()
          .and()
          .httpBasic();
    }
	
	@Bean
	  public InMemoryUserDetailsManager userDetailsService() {
	    UserDetails user = User
	        .withUsername("user")
	        .password("{noop}pwd")
	        .roles("USER")
	        .build();
	    return new InMemoryUserDetailsManager(user);
	  }
}