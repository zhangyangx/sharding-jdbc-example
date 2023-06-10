package org.kzlh.example.shardingjdbc.service;

import org.kzlh.example.shardingjdbc.entity.Order;

/**
 * @author yang.zhang 2023/6/10
 */
public interface OrderService {
    int save(Order order);
}
