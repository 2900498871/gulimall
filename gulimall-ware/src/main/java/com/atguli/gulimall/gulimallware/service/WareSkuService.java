package com.atguli.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguli.common.utils.PageUtils;
import com.atguli.gulimall.gulimallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:52:21
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

