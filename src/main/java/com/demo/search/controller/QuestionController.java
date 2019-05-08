package com.demo.search.controller;

import com.demo.search.pojo.Question;
import com.demo.search.pojo.QuestionDetail;
import com.demo.search.service.QuestionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 16:45
 * 4
 */
@RestController
@RequestMapping("/question")
@Api("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    //查询出所有问题
    @GetMapping("/questionlist")
    public List<Question> getQuestionList(){
        return questionService.getQuestionList();
    }
    //根据问题id查询问题的详细
    @GetMapping("/detail/{qid}")
    public QuestionDetail getDetailByQid(@PathVariable int qid){
        return questionService.getDetailByQid(qid);
    }
}
