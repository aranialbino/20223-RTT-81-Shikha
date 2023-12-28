package com.shikharani.onlinelearningplatform.constants;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

public class CommonUtil {

	public static Long getUserIdFromSession(HttpSession session) {
		Object user_id_obj = session.getAttribute(Constants.USER_ID);
		if (user_id_obj != null) {
			return (Long) user_id_obj;
		}
		return null;
	}

}
