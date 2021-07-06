package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	@GetMapping("/hello")
	  public String hello() {
	    return "Welcome Spring Boot Sample Application";
	  }

}
