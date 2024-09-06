package com.ta2khu75.quiz.model.response.details;

import com.ta2khu75.quiz.model.response.AccountResponse;
import com.ta2khu75.quiz.model.response.RoleResponse;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDetailsResponse extends AccountResponse {
	boolean enabled;
	boolean nonLocked;
	RoleResponse role;
}
