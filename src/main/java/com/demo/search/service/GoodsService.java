package com.demo.search.service;

import com.demo.search.pojo.Goods;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 15:16
 * 4
 */
public interface GoodsService {
    List<Goods> getGoodsByName(String goodsname);
}
