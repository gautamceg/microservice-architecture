package com.example.microservicebeta;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${myprop.location}")
	private String propLocation;
	
	@GetMapping("/")
	public String getPropLocation() {
		return propLocation;
	}

}
