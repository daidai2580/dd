package com.demo.search.service.impl;

import com.demo.search.mapper.GoodsMapper;
import com.demo.search.pojo.Goods;
import com.demo.search.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 12:01
 * 4
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;


    @Override
    public List<Goods> getGoodsByName(String goodsname) {
        //模糊查询字符串拼接
        String searchName = new StringBuilder("%").append(goodsname).append("%").toString();
        return goodsMapper.getGoodsByName(searchName);
    }
}
