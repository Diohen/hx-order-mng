package com.diohen.hx_order_mng.infrastructure.adapter.input;

import com.diohen.hx_order_mng.application.port.input.CreateOrderUseCase;
import com.diohen.hx_order_mng.application.port.input.dto.OrderCreatedOutput;
import com.diohen.hx_order_mng.application.service.dto.CreateOrderCommand;
import com.diohen.hx_order_mng.application.service.dto.CreateOrderItemCommand;
import com.diohen.hx_order_mng.infrastructure.adapter.input.rest.dto.CreateOrderResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create_order")
public class CreateOrderController {

    private final CreateOrderUseCase useCase;

    public CreateOrderController(CreateOrderUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<CreateOrderResponse> create(
            @RequestBody @Valid CreateOrderRequest request) {

        OrderCreatedOutput output = useCase.create(mapToCommand(request));

        CreateOrderResponse response = new CreateOrderResponse(
                output.getOrderId(),
                output.getStatus(),
                output.getTotal()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    private CreateOrderCommand mapToCommand(CreateOrderRequest request) {
        return new CreateOrderCommand(
                request.getOrder().getItems().stream()
                        .map(item -> new CreateOrderItemCommand(
                                item.getName(),
                                item.getValue()
                        ))
                        .toList()
        );
    }
}
