package com.matheusbus.Estudos.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbus.Estudos.Spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
