package com.diohen.hx_order_mng.domain.model;

import com.diohen.hx_order_mng.domain.exception.InvalidOrderItemException;

import java.math.BigDecimal;

public class OrderItem {

    private final String name;
    private final BigDecimal value;

    public OrderItem(String name, BigDecimal value) {
        if (name == null || name.isBlank()) {
            throw new InvalidOrderItemException ("Item name cannot be null or blank");
        }
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidOrderItemException("Item value cannot be null or zero or negative");
        }

        this.name = name;
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
