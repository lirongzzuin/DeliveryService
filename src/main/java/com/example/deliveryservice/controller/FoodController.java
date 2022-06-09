package com.example.deliveryservice.controller;

import com.example.deliveryservice.domain.Food;
import com.example.deliveryservice.dto.FoodRequestDto;
import com.example.deliveryservice.service.FoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"Food"})
@RestController
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;


    @ApiOperation(value = "레스토랑 음식 추가", notes = "해당 레스토랑에 음식 추가")
    @PostMapping("/restaurant/{restaurantId}/food/register")
    public void addRestaurantFood(
            @PathVariable Long restaurantId,
            @RequestBody List<FoodRequestDto> requestDtoList
    ) {
        foodService.addRestaurantFoods(restaurantId, requestDtoList);
    }

    @ApiOperation(value = "레스토랑 음식 조회", notes = "해당 레스토랑의 모든 음식 조회")
    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> findAllRestaurantFoods(
            @PathVariable Long restaurantId
    ) {
        return foodService.findAllRestaurantFoods(restaurantId);
    }
}
