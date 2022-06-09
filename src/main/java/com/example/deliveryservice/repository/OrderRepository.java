package com.example.deliveryservice.repository;


import com.example.deliveryservice.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
