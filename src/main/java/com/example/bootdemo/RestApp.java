package com.example.bootdemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApp {

	@GetMapping(path = "test")
	@RequestMapping
	public List<Map<String, Object>> greet() {
		List<Map<String, Object>> returnMap = jdbcTemplate.queryForList("SELECT * FROM roles");
		return returnMap;
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

}
