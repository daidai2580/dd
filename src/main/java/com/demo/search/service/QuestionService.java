package com.demo.search.service;

import com.demo.search.pojo.Question;
import com.demo.search.pojo.QuestionDetail;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 16:42
 * 4
 */
public interface QuestionService {
    List<Question> getQuestionList();

    QuestionDetail getDetailByQid(int qid);
}
