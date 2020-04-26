package com.atguli.gulimall.gulimallorder.dao;

import com.atguli.gulimall.gulimallorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:45:57
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
