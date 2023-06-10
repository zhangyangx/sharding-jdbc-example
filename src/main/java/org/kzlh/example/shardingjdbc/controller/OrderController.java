package org.kzlh.example.shardingjdbc.controller;

import org.kzlh.example.shardingjdbc.entity.Order;
import org.kzlh.example.shardingjdbc.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping
    public int save(@RequestBody Order order) {
        return orderService.save(order);
    }

}
