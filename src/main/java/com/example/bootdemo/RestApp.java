package com.example.bootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApp {

	@GetMapping(path = "test")
	@RequestMapping
	public String greet() {
		return "Hello World";
	}
}
