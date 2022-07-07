package com.virakvoan.demo.cotroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthWebSecurityConfiguration
{
//  @Bean
//  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    http
////         .csrf().disable()
//    .httpBasic()
//    .and()
//         .authorizeRequests()
//         .antMatchers(HttpMethod.GET, "/positions").hasRole("USER");
//	return null;
//  }
//
//  @Bean
//  public InMemoryUserDetailsManager userDetailsService() {
//    UserDetails user = User
//        .withUsername("user")
//        .password("{noop}pwd")
//        .roles("USER")
//        .build();
//    return new InMemoryUserDetailsManager(user);
//  }
}