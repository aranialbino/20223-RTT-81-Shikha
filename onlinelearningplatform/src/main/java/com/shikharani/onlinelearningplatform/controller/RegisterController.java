package com.shikharani.onlinelearningplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping("/register")
	public String gotoRegister(Model model) {
		System.out.println("Inside gotoRegister ");
		User user = new User();
		model.addAttribute("userModel", user);
		return "register";
	}

	@RequestMapping(value = "/register/save", method = RequestMethod.POST)
	public String saveRegistration(@ModelAttribute User userModel, Model model) {
		System.out.println("Inside saveRegistration ");
		System.out.println("userModelObj= " + userModel);
		if (userModel != null) {
			try {
				System.out.println(userModel);
				registerService.save(userModel);
				return "login";
			} catch (Exception e) {
				model.addAttribute("userModel", userModel);
				model.addAttribute("errorMessage", "Email already exists.");
				return "register";
			}
		}
		model.addAttribute("userModel", userModel);
		return "register";
	}

}
