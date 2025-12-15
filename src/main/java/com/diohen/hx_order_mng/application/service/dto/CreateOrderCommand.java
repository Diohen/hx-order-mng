package com.diohen.hx_order_mng.application.service.dto;

import java.util.List;

public class CreateOrderCommand {
    private final List<CreateOrderItemCommand> items;

    public CreateOrderCommand(List<CreateOrderItemCommand> items) {
        this.items = items;
    }

    public List<CreateOrderItemCommand> getItems() {
        return items;
    }
}
