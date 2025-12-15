package com.diohen.hx_order_mng.infrastructure.adapter.input.rest.dto;

import java.math.BigDecimal;

public class CreateOrderResponse {

    private String orderId;
    private String status;
    private BigDecimal total;

    public CreateOrderResponse(String orderId, String status, BigDecimal total) {
        this.orderId = orderId;
        this.status = status;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
