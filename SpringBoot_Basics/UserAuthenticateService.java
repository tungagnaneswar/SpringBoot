package com.dockerboot.service;

import org.springframework.stereotype.Service;

import com.dockerboot.repository.UserAuthenticationRepository;

@Service
public class UserAuthenticateService {

	UserAuthenticationRepository authenticationRepository;

	public UserAuthenticateService(UserAuthenticationRepository authenticationRepository) {
		this.authenticationRepository = authenticationRepository;
	}

	public boolean auth(String username, String password) {
		return authenticationRepository.findByUsername(username).map(user -> user.getPassword().equals(password))
				.orElse(false);
	}
}
