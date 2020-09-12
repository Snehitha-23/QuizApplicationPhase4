package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.QuestionsRepository;
import com.demo.model.Questions;
import com.demo.service.QuestionsService;
@Service
public class QuestionsServiceImpl implements QuestionsService{
@Autowired
private QuestionsRepository dao;
	@Override
	public Questions addQuestion(Questions question) {
		
		return dao.save(question);
	}

	@Override
	public Questions getQuestionById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Questions> getAllQuestions() {
	
		return dao.findAll();
	}

}
