package com.atguli.gulimall.gulimallproduct.dao;

import com.atguli.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-24 21:33:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
