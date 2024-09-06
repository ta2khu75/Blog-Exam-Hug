package com.ta2khu75.quiz.model.response;


import com.ta2khu75.quiz.model.base.AccountBase;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
public class AccountResponse extends AccountBase {
	String id;
	String username;
	String email;
}
