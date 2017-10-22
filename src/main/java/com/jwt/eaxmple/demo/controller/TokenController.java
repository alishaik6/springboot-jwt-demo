package com.jwt.eaxmple.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.eaxmple.demo.model.JwtUser;
import com.jwt.eaxmple.demo.security.JwtGenerator;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;

@RestController
@RequestMapping("/api/token")
public class TokenController {
	
	@PostMapping
	public String generate (@RequestBody final JwtUser user)
	{
		
		JwtGenerator generator  = new JwtGenerator();
		
		return generator.generate(user);
	}
	
	@PostMapping("/consume")
	public String consume(@RequestBody final String token)
	{
		String values="";
		
		try {
			Claims claims = Jwts.parser().setSigningKey("mysecret").parseClaimsJws(token).getBody();
			
			 values = "ID: " + claims.getId() + "\n Subject: " + claims.getSubject()+ ""
					+ " Issuer: " + claims.getIssuer()+" Expiration: " + claims.getExpiration();
			 
			 return values;
		}
		
		catch (ExpiredJwtException e)
		{
			System.out.println("token expired");
			return "token expired";
		}
		
		catch (Exception e)
		{
			System.out.println("unknown excepton occured");
			return "error occured in processing request";
		}
		
		
		
		
		
	}

}
