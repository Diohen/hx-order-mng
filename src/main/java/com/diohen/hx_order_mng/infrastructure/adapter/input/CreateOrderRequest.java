package com.diohen.hx_order_mng.infrastructure.adapter.input;

import jakarta.validation.Valid;

public class CreateOrderRequest {
    @Valid
    private OrderRequest order;

    public OrderRequest getOrder() {
        return order;
    }
}
