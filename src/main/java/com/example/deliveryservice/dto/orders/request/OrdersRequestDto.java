package com.example.deliveryservice.dto.orders.request;


import com.example.deliveryservice.domain.OrderItem;
import lombok.Getter;

import java.util.List;

@Getter
public class OrdersRequestDto {
    private Long restaurantId;
    private List<OrderItem> foods;
}
