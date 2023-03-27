package com.matheusbus.Estudos.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbus.Estudos.Spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
