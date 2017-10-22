//package com.jwt.eaxmple.demo.security;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//
//public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint{
//
//	@Override
//	public void commence(HttpServletRequest arg0, HttpServletResponse oHttpServletResponse, AuthenticationException arg2)
//			throws IOException, ServletException {
//		oHttpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"UN-Authorized user");
//		
//	}
//
//}
