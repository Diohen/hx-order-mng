package com.diohen.hx_order_mng.infrastructure.adapter.input;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class OrderRequest {
    @NotEmpty
    private List<ItemRequest> items;

    public List<ItemRequest> getItems() {
        return items;
    }
}
