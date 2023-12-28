package com.shikharani.onlinelearningplatform.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.shikharani.onlinelearningplatform.constants.Constants;
import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

public class CommonController {

	@Autowired
	UserRepository userRepository;

	public User getUserObject(HttpSession session) {
		Object user_id_obj = session.getAttribute(Constants.USER_ID);
		if (user_id_obj != null) {
			Long user_id = (Long) user_id_obj;
			System.out.println("Inside getUserObject. user_id= " + user_id);
			Optional<User> userObj = userRepository.findById(user_id);
			if (userObj.isPresent()) {
				User user = userObj.get();
				return user;
			}
		}
		return null;
	}

}
