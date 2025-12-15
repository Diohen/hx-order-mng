package com.diohen.hx_order_mng.application.service;

import com.diohen.hx_order_mng.application.port.input.CreateOrderUseCase;
import com.diohen.hx_order_mng.application.port.input.dto.OrderCreatedOutput;
import com.diohen.hx_order_mng.application.port.output.OrderIdGenerator;
import com.diohen.hx_order_mng.application.port.output.OrderRepository;
import com.diohen.hx_order_mng.application.service.dto.CreateOrderCommand;
import com.diohen.hx_order_mng.domain.model.Order;
import com.diohen.hx_order_mng.domain.model.OrderItem;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderService implements CreateOrderUseCase {

    private final OrderRepository orderRepository;
    private final OrderIdGenerator orderIdGenerator;

    public CreateOrderService(OrderRepository orderRepository,
                              OrderIdGenerator orderIdGenerator) {
        this.orderRepository = orderRepository;
        this.orderIdGenerator = orderIdGenerator;
    }

    @Override
    public OrderCreatedOutput create(CreateOrderCommand command) {
        Order order = new Order(orderIdGenerator.generate());

        command.getItems()
                .forEach(item -> order.addItem(
                        new OrderItem(item.getName(), item.getValue())
                ));

        orderRepository.save(order);

        return new OrderCreatedOutput(
                order.getId(),
                order.getStatus().name(),
                order.getTotal()
        );
    }
}
