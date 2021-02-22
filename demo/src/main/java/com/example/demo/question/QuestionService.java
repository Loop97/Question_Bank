package com.example.demo.question;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    public List<Question> getQuestions(){
        return List.of(
			new Question(
				(long) 1,
				"first question",
				1,
				"first question body",
				10,
				"first question options",
				"first question answers"
			)
		);

    }
    
}
