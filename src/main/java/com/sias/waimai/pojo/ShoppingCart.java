package com.sias.waimai.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 * @author li+
 * @date 2024/12/7 12:03
 */
@Data
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long id;
    //名称
    private String name;
    //图片
    private String image;
    //用户id
    private Long userId;
    //菜品id
    private Long dishId;
    //套餐id
    private Long setmealId;
    //口味
    private String dishFlavor;
    //数量
    private Integer number;
    //金额
    private BigDecimal amount;

    //创建时间
    private LocalDateTime createTime;
}
