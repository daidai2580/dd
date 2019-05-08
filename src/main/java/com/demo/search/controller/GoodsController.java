package com.demo.search.controller;

import com.demo.search.pojo.Goods;

import com.demo.search.service.GoodsService;
import com.demo.search.service.impl.GoodsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 12:01
 * 4
 * 商品查询
 */
@RestController
@RequestMapping("/goods")
@Api(value = "goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @Autowired
    RedisTemplate redisTemplate;


    //根据用户输入商品名模糊查询
    @GetMapping("/search/goodsname={goodsname}")
    public List<Goods> getGoodsByName(@PathVariable String goodsname){

        List<Goods> goodsList;
        //缓存中有就直接到缓存中拿 不然到数据库查询 设置过期时间为30天
        if(redisTemplate.opsForHash().hasKey("goods",goodsname)){
            Map<String, List<Goods>> map = redisTemplate.opsForHash().entries("goods");
            goodsList=map.get(goodsname);

        }else {
            goodsList=goodsService.getGoodsByName(goodsname);
            if(goodsList!=null){
                redisTemplate.opsForHash().put("goods",goodsname,goodsList);
                redisTemplate.expire("goods",30, TimeUnit.DAYS );

            }

        }


        return goodsList;
    }
}
