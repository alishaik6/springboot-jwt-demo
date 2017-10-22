//package com.jwt.eaxmple.demo.security;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//
//public class JwtAuthetcationTokenFilter extends AbstractAuthenticationProcessingFilter{
//
//	public JwtAuthetcationTokenFilter() {
//		super("/**");
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest arg0, HttpServletResponse arg1)
//			throws AuthenticationException, IOException, ServletException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public void setAuthenticationManger(AuthenticationManager autheticationManager) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setAuthticationSuccesshandler(JwtSuccessHandler jwtSuccessHandler) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
