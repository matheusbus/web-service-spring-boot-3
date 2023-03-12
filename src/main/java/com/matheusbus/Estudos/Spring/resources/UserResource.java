package com.matheusbus.Estudos.Spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusbus.Estudos.Spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		return ResponseEntity.ok().body((new User(1L, "Matheus", "matheusbuschermoehle@gmail.com", "47 991705840", "123456")));
	}
	
}
