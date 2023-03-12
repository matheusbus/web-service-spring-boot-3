package com.matheusbus.Estudos.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusbus.Estudos.Spring.entities.Order;
import com.matheusbus.Estudos.Spring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		return orderRepository.findById(id).get();
	}
	
}
