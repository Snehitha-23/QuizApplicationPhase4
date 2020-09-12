package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {

}
