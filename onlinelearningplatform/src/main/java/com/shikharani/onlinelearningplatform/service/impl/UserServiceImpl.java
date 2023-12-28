package com.shikharani.onlinelearningplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.repository.UserRepository;
import com.shikharani.onlinelearningplatform.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUserRole(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		return user;
	}
}
