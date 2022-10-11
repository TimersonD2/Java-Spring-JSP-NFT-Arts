package com.codingdojo.nftarts.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	//http://localhost:8080
	@RequestMapping("/")
	public String index() {
		return "Hello Spring";
	}
	
	// Path variable
	//http://localhost:8080/welcome/{user}
	@RequestMapping("/welcome/{user}")
	public String welcome(@PathVariable String user) {
		return "Welome " + user;
	}
	
	// Path parameter
	//http://localhost:8080/dojo?student={student}&stack={stack}
	@RequestMapping("/dojo")
	public String dojo(@RequestParam String student, @RequestParam String stack) {
		return String.format("Welcome %s to your %s stack", student, stack);
	}

}
