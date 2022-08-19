package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author laugh
 * @email computers2019@163.com
 * @date 2022-08-19 02:10:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
