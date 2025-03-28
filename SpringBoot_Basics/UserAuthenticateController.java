package com.dockerboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dockerboot.service.UserAuthenticateService;

@RestController
@RequestMapping("/api/auth")
public class UserAuthenticateController {

	UserAuthenticateService userAuthenticateService;
	public UserAuthenticateController(UserAuthenticateService userAuthenticateService) {
		this.userAuthenticateService = userAuthenticateService;
	}

	@PostMapping("/login")
	public String getAuth(@RequestParam String username,@RequestParam String password) {
		boolean isExist = userAuthenticateService.auth(username, password);
		if (isExist) {
			return "Login Succesfull";
		} else {
			return "User Not Found.";
		}
	}
}
