package com.diohen.hx_order_mng.domain.model;

import com.diohen.hx_order_mng.domain.exception.OrderAlreadyClosedException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private final List<OrderItem> items;
    private OrderStatus status;

    public Order(String id) {
        this.id = id;
        this.items = new ArrayList<>();
        this.status = OrderStatus.OPEN;
    }

    public void addItem(OrderItem item) {
        if (status == OrderStatus.CLOSED) {
            throw new OrderAlreadyClosedException("Cannot add items to a closed order");
        }
        items.add(item);
    }

    public BigDecimal getTotal() {
        return items.stream()
                .map(OrderItem::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public String getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
