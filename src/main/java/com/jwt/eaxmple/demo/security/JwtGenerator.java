package com.jwt.eaxmple.demo.security;

import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

import com.jwt.eaxmple.demo.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class JwtGenerator {

	public String generate(JwtUser user) {
		
		Claims claims = Jwts.claims().setSubject(user.getUserName()).setExpiration(new Date(System.currentTimeMillis()+(1000*3*4)));
		
		claims.put("userId", String.valueOf(user.getId()));
		claims.put("role", user.getRole());
		
//		SecretKey key = MacProvider.generateKey(SignatureAlgorithm.HS256);
//		byte[] keyBytes = key.getEncoded();
//		
//		String base64Encoded = Base64.getEncoder().encodeToString(keyBytes);
//		
//		System.out.println("************This is key bytes ******"+keyBytes);
//		
//		System.out.println("************This is key encoded ******"+base64Encoded);
		
		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "mysecret").compact();
		
		//return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.ES512, "mysecret").compact();
		//[B@59ab17a8
		
		
	}

}
