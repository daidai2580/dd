package com.demo.search.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品实体类
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 11:59
 * 4
 */
@Data
public class Goods implements Serializable {
    private int id;
    private String goodsname;
}
