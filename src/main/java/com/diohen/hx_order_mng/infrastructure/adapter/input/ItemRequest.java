package com.diohen.hx_order_mng.infrastructure.adapter.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class ItemRequest {
    @NotBlank
    private String name;

    @Positive
    private BigDecimal value;

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }
}
