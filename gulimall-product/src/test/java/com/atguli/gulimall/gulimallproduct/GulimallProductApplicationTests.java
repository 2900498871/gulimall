package com.atguli.gulimall.gulimallproduct;

import com.atguli.gulimall.gulimallproduct.service.SkuImagesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    SkuImagesService skuImagesService;
    @Test
    void contextLoads() {
        System.out.println(skuImagesService.list());
    }

}
