package com.example.demo.question;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "api/v1/question")
public class QuestionController {
    
    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService){
        this.questionService = new QuestionService();
    }
    @GetMapping
	public List<Question> getQuestions(){
		return questionService.getQuestions();
	}
}
