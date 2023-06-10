package org.kzlh.example.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 需要分库分表的表
 *
 * @author yang.zhang 2023/6/10
 */
@TableName("main_order")
public class Order {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 主订单号，根据该字段分表
     */
    private Long mainOrderNo;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMainOrderNo() {
        return mainOrderNo;
    }

    public void setMainOrderNo(Long mainOrderNo) {
        this.mainOrderNo = mainOrderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
