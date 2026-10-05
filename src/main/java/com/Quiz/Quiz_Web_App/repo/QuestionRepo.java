package com.Quiz.Quiz_Web_App.repo;

import com.Quiz.Quiz_Web_App.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {
}
