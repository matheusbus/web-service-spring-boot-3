package com.matheusbus.Estudos.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbus.Estudos.Spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
