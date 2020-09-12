package com.demo.service;

import java.util.List;

import com.demo.model.Answers;


public interface AnswersService {

	public Answers addAnswer(Answers answer);
	public Answers getAnswerById(int id);
	public List<Answers>getAllAnswers();
	
	
	
	
	
}
