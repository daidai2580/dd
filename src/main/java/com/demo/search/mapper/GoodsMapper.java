package com.demo.search.mapper;

import com.demo.search.pojo.Goods;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 12:01
 * 4
 */
public interface GoodsMapper {
    List<Goods> getGoodsByName(String searchName);
}
