package com.nhom18.btljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhom18.btljava.dao.UserDao;
import com.nhom18.btljava.model.User;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	UserDao userDao;

	@GetMapping
	public String register() {
		return "register";
	}

	@PostMapping
	public String doRegister(@ModelAttribute("user") User user) {
		System.out.println(user.getUserFirstName());
		System.out.println(user.getUserLastName());
		System.out.println(user.getUserEmail());
		System.out.println(user.getUserAddress());
		System.out.println(user.getUserPassword());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserToken());
		return "register";
	}
}
