//package com.jwt.eaxmple.demo.config;
//
//import java.util.Collections;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.jwt.eaxmple.demo.security.JwtAuthenticationEntryPoint;
//import com.jwt.eaxmple.demo.security.JwtAuthenticationProvider;
//import com.jwt.eaxmple.demo.security.JwtAuthetcationTokenFilter;
//import com.jwt.eaxmple.demo.security.*;
//
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
//@Configuration
//public class JwtSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	
//	private JwtAuthenticationProvider authticationProvider;
//	private JwtAuthenticationEntryPoint entryPoint;
//
//	@Bean
//	
//	public AuthenticationManager autheticationManager()
//	{
//		return new ProviderManager(Collections.singletonList(authticationProvider));
//	}
//	
//	
//	@Bean
//	public JwtAuthetcationTokenFilter autheticationToeknFIlter()
//	{
//		JwtAuthetcationTokenFilter filter = new JwtAuthetcationTokenFilter();
//		
//		filter.setAuthenticationManger(autheticationManager());
//		filter.setAuthticationSuccesshandler(new JwtSuccessHandler());
//		return filter;
//		
//	}
//	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.csrf().disable()
//		.authorizeRequests().antMatchers("**/rest/**").authenticated()
//		.and()
//		.exceptionHandling().authenticationEntryPoint(entryPoint)
//		.and()
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		
//		http.addFilterBefore(autheticationToeknFIlter(), UsernamePasswordAuthenticationFilter.class);
//		http.headers().cacheControl();
//		
//	}
//}
