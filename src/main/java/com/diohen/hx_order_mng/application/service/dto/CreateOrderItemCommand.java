package com.diohen.hx_order_mng.application.service.dto;

import java.math.BigDecimal;

public class CreateOrderItemCommand {
    private final String name;
    private final BigDecimal value;

    public CreateOrderItemCommand(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }
}