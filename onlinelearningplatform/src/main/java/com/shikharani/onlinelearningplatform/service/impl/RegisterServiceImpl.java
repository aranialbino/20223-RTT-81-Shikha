package com.shikharani.onlinelearningplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.repository.UserRepository;
import com.shikharani.onlinelearningplatform.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

}
