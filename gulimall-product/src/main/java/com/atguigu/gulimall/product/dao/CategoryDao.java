package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laugh
 * @email computers2019@163.com
 * @date 2022-08-17 23:55:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
