package com.axis.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class UserException extends RuntimeException {

	private static final long serialVersionUID=1L;
	public UserException(String msg) {
		super();
	}
}
