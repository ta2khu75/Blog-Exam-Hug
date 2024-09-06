package com.ta2khu75.quiz.model.request.update;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountPasswordRequest {
	@NotBlank
	String password;
	@NotBlank
	String newPassword;
	@NotBlank
	String confirmPassword;
}
