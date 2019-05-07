package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class HelloWorld {
	@GetMapping(value = "/service/{data}")
	public String helloworld(@PathVariable("data") String str) {
		return "Welcome To " + str;
	}
}
