package com.atguli.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguli.common.utils.PageUtils;
import com.atguli.gulimall.gulimallorder.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:45:57
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

