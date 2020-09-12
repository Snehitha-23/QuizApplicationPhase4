package com.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table
@Getter
@Setter
@NoArgsConstructor

//@AllArgsConstructor
@ToString
public class Questions {
	@Id
	@GeneratedValue
	private int qid;
	private String Question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="ANSWERS_ID")
//	private Answers ans;
	
//	public Questions(String Question,String optionA,String optionB,String optionC,String optionD) {
//	    this.Question=Question;
//	    this.optionA=optionA;
//	    this.optionB=optionB;
//	    this.optionC=optionC;
//	    this.optionD=optionD;
//	   
//	}
//
//	@Override
//	public String toString() {
//	    return "Questions{" +
//	            "id=" + qid +
//	            ", question='" + Question +
//	            ", optionA=" + optionA +    
//	            ",optionB=" + optionB +   
//	            ",optionC=" + optionC +    
//	            ",optionD=" + optionD +    
//	            '}';
//	}
	
}
