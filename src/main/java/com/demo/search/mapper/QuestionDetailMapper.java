package com.demo.search.mapper;

import com.demo.search.pojo.QuestionDetail;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 16:56
 * 问题详细
 * 4
 */
public interface QuestionDetailMapper {
    QuestionDetail getDetailByQid(int qid);
}
