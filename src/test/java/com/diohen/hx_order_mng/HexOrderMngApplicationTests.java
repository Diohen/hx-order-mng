package com.diohen.hx_order_mng;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.context.ApplicationContext;

import com.diohen.hx_order_mng.application.port.input.CreateOrderUseCase;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HexOrderMngApplicationTests {

    @Autowired
    private ApplicationContext context;

    @MockitoBean
    private CreateOrderUseCase createOrderUseCase;

    @Test
    void contextLoads() {
        assertNotNull(context);
        assertTrue(context.getBeanDefinitionCount() > 0);
    }

}
