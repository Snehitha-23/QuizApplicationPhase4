package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Answers;
import com.demo.service.AnswersService;

@RestController
public class AnswersController {
	@Autowired
	private AnswersService service;
	@PostMapping("/answer")
	public Answers addAnswer(@RequestBody Answers answer) {
		return service.addAnswer(answer);
	}

	@DeleteMapping("/answer/{id}")

	public void getAnswerById(@PathVariable int id) {

		service.getAnswerById(id);

	}

	@GetMapping("/answers")

	public List<Answers> getAllAnswers() {

		return service.getAllAnswers();

	}


}
