package com.diohen.hx_order_mng.application.port.input.dto;

import java.math.BigDecimal;

public class OrderCreatedOutput {

    private final String orderId;
    private final String status;
    private final BigDecimal total;

    public OrderCreatedOutput(String orderId, String status, BigDecimal total) {
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
