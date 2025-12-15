package com.diohen.hx_order_mng.infrastructure.adapter.output.persistence;

import com.diohen.hx_order_mng.application.port.output.OrderRepository;
import com.diohen.hx_order_mng.domain.model.Order;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryOrderRepository implements OrderRepository {

    private final Map<String, Order> database = new ConcurrentHashMap<>();

    @Override
    public void save(Order order) {
        database.put(order.getId(), order);
    }
}
