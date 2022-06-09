package com.example.deliveryservice.repository;


import com.example.deliveryservice.domain.OrderItem;
import com.example.deliveryservice.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    List<OrderItem> findOrderItemsByOrders(Orders orders);
}