package com.diohen.hx_order_mng.infrastructure.adapter.output.id;

import com.diohen.hx_order_mng.application.port.output.OrderIdGenerator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UuidOrderIdGenerator implements OrderIdGenerator {

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
