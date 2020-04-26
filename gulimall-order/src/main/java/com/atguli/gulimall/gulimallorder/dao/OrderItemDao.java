package com.atguli.gulimall.gulimallorder.dao;

import com.atguli.gulimall.gulimallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:45:58
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
