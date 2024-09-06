package com.ta2khu75.quiz.model.response.details;

import java.util.List;

import com.ta2khu75.quiz.model.response.ExamResultResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ExamResultDetailsResponse extends ExamResultResponse {
	private List<UserAnswerResponse> userAnswers;
}
