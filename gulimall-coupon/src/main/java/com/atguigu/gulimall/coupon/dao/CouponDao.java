package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author laugh
 * @email computers2019@163.com
 * @date 2022-08-19 01:48:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
