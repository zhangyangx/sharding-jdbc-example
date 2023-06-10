package org.kzlh.example.shardingjdbc.service.impl;

import org.kzlh.example.shardingjdbc.entity.Order;
import org.kzlh.example.shardingjdbc.mapper.OrderMapper;
import org.kzlh.example.shardingjdbc.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int save(Order order) {
        return orderMapper.insert(order);
    }
}
