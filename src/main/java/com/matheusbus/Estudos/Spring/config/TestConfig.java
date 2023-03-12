package com.matheusbus.Estudos.Spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusbus.Estudos.Spring.entities.User;
import com.matheusbus.Estudos.Spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Matheus Buschermoehle", "matheusbus@gmail.com", "47 991705840", "123456");
		User u2 = new User(null, "Jonas João", "jonas@gmail.com", "47 995186605", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
