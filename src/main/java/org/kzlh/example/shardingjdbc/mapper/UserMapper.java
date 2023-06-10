package org.kzlh.example.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.kzlh.example.shardingjdbc.entity.User;

/**
 * @author yang.zhang 2023/6/10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
