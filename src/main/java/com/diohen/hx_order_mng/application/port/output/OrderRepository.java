package com.diohen.hx_order_mng.application.port.output;

import com.diohen.hx_order_mng.domain.model.Order;

public interface  OrderRepository {
    void save(Order order);
}
