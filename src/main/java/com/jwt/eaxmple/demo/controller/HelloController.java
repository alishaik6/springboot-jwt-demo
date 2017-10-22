package com.jwt.eaxmple.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/hello")
public class HelloController {

	@GetMapping
	public String greetingMsg()
	{
		return "The app is up and running";
	}
}
