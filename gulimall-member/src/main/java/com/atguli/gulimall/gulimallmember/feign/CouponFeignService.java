package com.atguli.gulimall.gulimallmember.feign;

import com.atguli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {


    @RequestMapping("/gulimallcoupon/coupon/member/coupons")
    public R membercoupons();
}
