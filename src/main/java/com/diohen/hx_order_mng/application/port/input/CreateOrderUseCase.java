package com.diohen.hx_order_mng.application.port.input;

import com.diohen.hx_order_mng.application.port.input.dto.OrderCreatedOutput;
import com.diohen.hx_order_mng.application.service.dto.CreateOrderCommand;

public interface CreateOrderUseCase {
    OrderCreatedOutput create(CreateOrderCommand command);
}
