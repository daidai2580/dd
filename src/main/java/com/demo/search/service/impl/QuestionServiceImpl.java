package com.demo.search.service.impl;

import com.demo.search.mapper.QuestionDetailMapper;
import com.demo.search.mapper.QuestionMapper;
import com.demo.search.pojo.Question;
import com.demo.search.pojo.QuestionDetail;
import com.demo.search.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 16:45
 * 4
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    QuestionDetailMapper questionDetailMapper;
    //拿到问题列表
    @Override
    public List<Question> getQuestionList() {
        return questionMapper.getQuestionList();
    }
    //根据问题id拿到详细的问题内容
    @Override
    public QuestionDetail getDetailByQid(int qid) {
        return questionDetailMapper.getDetailByQid(qid);
    }

}
