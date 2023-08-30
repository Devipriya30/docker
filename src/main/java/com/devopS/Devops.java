package com.devopS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Devops {
	@GetMapping(value="/sendhi")
	public String hi() {
		return "devops created";
	}

}
