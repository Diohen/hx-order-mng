package com.diohen.hx_order_mng.domain.exception;

public class OrderAlreadyClosedException extends RuntimeException {
    public OrderAlreadyClosedException(String message) {
        super(message);
    }
}
