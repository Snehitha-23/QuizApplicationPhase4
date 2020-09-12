package com.demo.service;

import java.util.List;

import com.demo.model.Questions;

public interface QuestionsService {

	public Questions addQuestion(Questions question);
	public Questions getQuestionById(int id);
	public List<Questions>getAllQuestions();
	
	
}
