package com.atguli.gulimall.gulimallmember.dao;

import com.atguli.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:36:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
