package com.Quiz.Quiz_Web_App.controller;

import com.Quiz.Quiz_Web_App.dto.LoginRequset;
import com.Quiz.Quiz_Web_App.entity.QuizQuestion;
import com.Quiz.Quiz_Web_App.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")

public class LoginController {


    @Autowired
    QuestionService questionService;

    private final  String USERNAME="user";

    private final String PASSWORD ="password";


    @PostMapping("/login")
    public String login(@RequestBody LoginRequset loginRequset)
    {
        if (USERNAME.equals(loginRequset.getUsername())&&PASSWORD.equals(loginRequset.getPassword()))
        {

            return "Login Successfull";
        }else
        {
            return "Invalid username or password";
        }
    }
    @GetMapping("/Question")
    public List<QuizQuestion> getQuestions(){

        return questionService.getAllQuestion();
    }
    @PostMapping("/save")
    public QuizQuestion saveQuestion(@RequestBody QuizQuestion question){

        QuizQuestion saved=  questionService.saveQuestion(question);
      return saved;
    }
}
