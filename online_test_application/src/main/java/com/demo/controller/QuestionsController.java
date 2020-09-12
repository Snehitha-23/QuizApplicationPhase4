package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.demo.model.Questions;
import com.demo.service.QuestionsService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class QuestionsController {
@Autowired
private QuestionsService service;
@PostMapping("/question")
public Questions addQuestion(@RequestBody Questions question) {
	return service.addQuestion(question);
}

@GetMapping("/question/{id}")

public void getQuestionById(@PathVariable int id) {

	service.getQuestionById(id);

}

@GetMapping("/questions")

public List<Questions> getAllQuestions() {

	return service.getAllQuestions();

}










}
