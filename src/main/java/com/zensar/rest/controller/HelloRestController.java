package com.zensar.rest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Writing test case for every piece business code including spring controller is mandate
@RestController
public class HelloRestController {
	
	@GetMapping("/greet/{name}")
	public String sayHello(@PathVariable(name="name") String name) {
		System.out.println("Testing sayHello");
		return "Hello.."+name.toUpperCase();
	}

	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String msg) {
		return new ResponseEntity<>("Message Created "+msg,HttpStatus.CREATED);
	}
}