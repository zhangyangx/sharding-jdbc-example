package org.kzlh.example.shardingjdbc.service;

import org.junit.jupiter.api.Test;
import org.kzlh.example.shardingjdbc.entity.Order;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@SpringBootTest
public class OrderServiceTest {

    @Resource
    private OrderService orderService;

    @Test
    public void save() {
        Order order = new Order();
        order.setUserId(2L);
        int save = orderService.save(order);
        System.out.println(save);
    }
}