package com.ta2khu75.quiz.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(nullable = false)
	String answerString;
	@Column(nullable = false)
	Boolean correct;
	@ManyToOne
	Quiz quiz;
}
