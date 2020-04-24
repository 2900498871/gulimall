package com.atguli.gulimall.gulimallproduct.dao;

import com.atguli.gulimall.gulimallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-24 21:33:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
