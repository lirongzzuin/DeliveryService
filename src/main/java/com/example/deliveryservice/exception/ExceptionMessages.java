package com.example.deliveryservice.exception;

public final class ExceptionMessages {

    // Common
    public static final String RESTAURANT_IS_NULL = "레스토랑이 없습니다.";

    // FOOD
    public static final String RESTAURANT_FOOD_EXIST = "중복된 이름의 음식이 존재합니다.";
    public static final String FOOD_PRICES_UNDER_MIN = "음식 가격이 100원 미만입니다.";
    public static final String FOOD_PRICES_OVER_MAX = "음식 가격이 1,000,000원을 초과했습니다.";
    public static final String ILLEGAL_FOOD_PRICES_UNIT = "음식 가격이 100원 단위로 입력되었습니다.";


    // Order
    public static final String ILLEGAL_FOOD_ORDER_QUANTITY = "음식 주문 수량은 1 ~ 100미만으로 입니다.";
    public static final String CANT_FIND_FOOD = "해당 음식이 없습니다.";
    public static final String ILLEGAL_TOTAL_PRICE = "음식점의 최소 주문 가격을 넘지 않았습니다.";

    // Restaurant
    public static final String ILLEGAL_MIN_ORDER_PRICE_RANGE = "최소주문 가격 허용값을 벗어났습니다.";
    public static final String ILLEGAL_MIN_ORDER_PRICE_UNIT = "100원 단위로 입력하지 않았습니다.";

    public static final String ILLEGAL_DELIVERY_FEE_RANGE = "기본 배달비 허용값을 벗어났습니다.";
    public static final String ILLEGAL_DELIVERY_FEE_UNIT = "기본 배달비 500원 단위로 입력하지 않았습니다.";
}
