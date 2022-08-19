package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author laugh
 * @email computers2019@163.com
 * @date 2022-08-19 12:42:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
