package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ANSWERS")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Answers {
	
@Id
	private int aid;
	private String answer;
//@OneToOne(mappedBy="ans")
//	@OneToOne(fetch=FetchType.EAGER)
//	private Questions question;
//	public 	Answers(String answer) {
//	    this.answer=answer;
//	}

	@Override
	public String toString() {
	    return "Answer{" +
	            "id=" + aid +
	            ", answer='" + answer + '\'' +
	            '}';
	}
}
