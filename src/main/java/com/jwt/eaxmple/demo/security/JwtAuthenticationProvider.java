//package com.jwt.eaxmple.demo.security;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import com.jwt.eaxmple.demo.model.JwtAuthenticationToken;
//import com.jwt.eaxmple.demo.model.JwtUser;
//import com.jwt.eaxmple.demo.model.JwtUserDetails;
//
//@Component
//public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider{
//
//    @Autowired
//    JwtValidator validator;
//	@Override
//	public boolean supports(Class<?> arg0) {
//		
//		return (JwtAuthenticationToken.class.isAssignableFrom(arg0));
//	}
//
//	@Override
//	protected void additionalAuthenticationChecks(UserDetails arg0, UsernamePasswordAuthenticationToken arg1)
//			throws AuthenticationException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken)
//			throws AuthenticationException {
//		// TODO Auto-generated method stub
//		JwtAuthenticationToken JwtAuthticationToken = (JwtAuthenticationToken) usernamePasswordAuthenticationToken;
//		String token = JwtAuthticationToken.getToken();
//		JwtUser jwtuser = validator .validate(token);
//		
//		if(jwtuser == null)
//		{
//			throw new RuntimeException("JWT toen incorrect");
//		}
//		
//		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
//                .commaSeparatedStringToAuthorityList(jwtuser.getRole());
//        return new JwtUserDetails(jwtuser.getUserName(), jwtuser.getId(),
//                token,
//                grantedAuthorities);
//		
//	}
//
//}
