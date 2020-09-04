package com.example.bootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApp {

	@GetMapping
	@RequestMapping(path = "/test")
	public String greet() {
		return "Hello World";
	}
}
