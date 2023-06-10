package org.kzlh.example.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.kzlh.example.shardingjdbc.entity.Order;

/**
 * @author yang.zhang 2023/6/10
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
