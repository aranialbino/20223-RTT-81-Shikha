package com.shikharani.onlinelearningplatform.service;

import org.springframework.stereotype.Service;

import com.shikharani.onlinelearningplatform.model.User;

@Service
public interface RegisterService {

	void save(User user);

}
