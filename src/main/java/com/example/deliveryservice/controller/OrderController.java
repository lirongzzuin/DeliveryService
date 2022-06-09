package com.example.deliveryservice.controller;

import com.example.deliveryservice.dto.orders.request.OrdersRequestDto;
import com.example.deliveryservice.dto.orders.response.OrdersResponseDto;
import com.example.deliveryservice.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"Order"})
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @ApiOperation(value = "음식 주문")
    @PostMapping("/order/request")
    public OrdersResponseDto orderFood(
            @RequestBody OrdersRequestDto orderRequestDto
    ) {
        return orderService.order(orderRequestDto);
    }

    @ApiOperation(value = "주문 조회")
    @GetMapping("/orders")
    public List<OrdersResponseDto> findAllOrder() {
        return orderService.findAllOrder();
    }
}
