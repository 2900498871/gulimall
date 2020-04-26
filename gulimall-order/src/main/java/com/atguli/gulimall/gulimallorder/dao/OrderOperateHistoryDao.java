package com.atguli.gulimall.gulimallorder.dao;

import com.atguli.gulimall.gulimallorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:45:58
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
