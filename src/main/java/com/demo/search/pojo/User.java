package com.demo.search.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 11:13
 * 4
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String address;

}
