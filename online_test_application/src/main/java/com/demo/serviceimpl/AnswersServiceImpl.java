package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AnswersRepository;
import com.demo.model.Answers;
import com.demo.service.AnswersService;
@Service
public class AnswersServiceImpl implements AnswersService {
@Autowired
private AnswersRepository dao;
	@Override
	public Answers addAnswer(Answers answer) {
		
		return dao.save(answer);
	}

	@Override
	public Answers getAnswerById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Answers> getAllAnswers() {
		return dao.findAll();
	}

}
