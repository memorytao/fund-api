package com.login;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Actor Not Found")
public class LoginError extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1766017529272971795L;
}
