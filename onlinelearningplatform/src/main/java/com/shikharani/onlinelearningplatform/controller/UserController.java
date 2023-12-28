package com.shikharani.onlinelearningplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shikharani.onlinelearningplatform.constants.Constants;
import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.model.UserRole;
import com.shikharani.onlinelearningplatform.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String gotoLogin(Model model) {
		model.addAttribute("userModel", new User());
		System.out.println("Inside gotoLogin ");
		return "login";
	}

	@RequestMapping("/login/check")
	public String checkLogin(@ModelAttribute User userModel, Model model, HttpSession session) {
		System.out.println("Inside /login/check ");
		System.out.println("userModelObj= " + userModel);
		if (userModel == null || userModel.getEmail() == null || userModel.getEmail().trim().length() == 0
				|| userModel.getPassword() == null || userModel.getPassword().trim().length() == 0) {
			model.addAttribute("errorMessage", "User Id/password can not be empty.");
			return "login";
		} else {
			// Check if user is/password is matching and uses role.
			String email = userModel.getEmail();
			String password = userModel.getPassword();
			System.out.println("email=" + email + ", password=" + password);
			User user = userService.getUserRole(email, password);

			if (user == null || user.getRole() == null) {
				model.addAttribute("errorMessage", "Invalid Id/password.");
				return "login";
			} else {
				UserRole userRole = user.getRole();
				if (userRole == UserRole.STUDENT) {
					// Student has enrolled.O
					session.setAttribute(Constants.USER_ID, user.getId());
					session.setAttribute(Constants.USER_ROLE, user.getRole());
					System.out.println("It is a STUDENT user.");
					return "forward:/studentHome";
				} else if (userRole == UserRole.INSTRUCTOR) {
					// Student has enrolled.O
					session.setAttribute(Constants.USER_ID, user.getId());
					session.setAttribute(Constants.USER_ROLE, user.getRole());
					System.out.println("It is a INSTRUCTOR user.");
					return "forward:/instructorHome";
				}
			}
		}
		return "login";
	}

}
