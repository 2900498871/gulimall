package com.atguli.gulimall.gulimallcoupon.controller;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguli.gulimall.gulimallcoupon.entity.CouponEntity;
import com.atguli.gulimall.gulimallcoupon.service.CouponService;
import com.atguli.common.utils.PageUtils;
import com.atguli.common.utils.R;



/**
 * 优惠券信息
 *
 * @author ren
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 23:25:42
 */
//nacos 配置中心自动刷新配置
@RefreshScope
@RestController
@RequestMapping("gulimallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${ren.username}")
    private String username;
    @Value("${ren.pass}")
    private String pass;


    @RequestMapping("/testnacos")
    public R testnacos(){
        return R.ok().put("username",username).put("pass",pass);
    }




    @RequestMapping("/member/coupons")
    public R membercoupons(){
        List<CouponEntity> couponEntities=new ArrayList();
        CouponEntity c= new CouponEntity();
        c.setCouponName("满100减10块");
        c.setAmount(BigDecimal.valueOf(1000));
        c.setCode("10000");
        c.setEnableEndTime(new Date());
        couponEntities.add(c);
        return R.ok().put("coupons",couponEntities);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
