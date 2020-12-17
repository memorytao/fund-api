package com.login;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class LoginController extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1257987193953335694L;

	@GetMapping("/login")
	String login(@RequestParam String user, @RequestParam String pass, Model model) {
		return "";
	}

}
