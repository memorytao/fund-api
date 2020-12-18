package com.login;

import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class LoginController {

	@GetMapping("/login")
	String login(@RequestParam(required = false) String user, @RequestParam(required = false) String pass,
			Model model) {
//		model.addAttribute("login_status", "SUCCESS");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("login_status", "SUCCESS");
		return jsonObject.toString();
	}

}
