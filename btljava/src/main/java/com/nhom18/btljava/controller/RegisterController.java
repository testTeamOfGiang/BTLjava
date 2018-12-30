package com.nhom18.btljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhom18.btljava.dao.UserDao;
import com.nhom18.btljava.model.User;
import com.nhom18.btljava.service.UserService;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	UserDao userDao;
	@Autowired
	UserService userService;

	@GetMapping
	public String register() {
		return "register";
	}

	@PostMapping
	public String doRegister(@ModelAttribute("user") User user, Model model) {
		System.out.println("firstname :" + user.getUserFirstName());
		System.out.println("lastname: " + user.getUserLastName());
		System.out.println("email: " + user.getUserEmail());
		System.out.println("address: " + user.getUserAddress());
		System.out.println("password: " + user.getUserPassword());
		System.out.println("phone: " + user.getUserPhone());
		System.out.println(user.getUserToken());
		boolean result = userService.addUser(user);
		System.out.println(result);
		if (result == true) {
			model.addAttribute("result", "tạo tài khoản thành công");
		} else {
			model.addAttribute("result", "tạo tài khoản thất bại");
		}
		return "register";
	}
}
