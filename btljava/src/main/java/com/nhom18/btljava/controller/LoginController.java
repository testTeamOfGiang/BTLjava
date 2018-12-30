package com.nhom18.btljava.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nhom18.btljava.model.User;
import com.nhom18.btljava.service.UserService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	UserService userService;

	@GetMapping
	public String login() {
		return "login";
	}

	@PostMapping
	public String doLogin(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		System.out.println(email);
		System.out.println(password);

		Object obj = userService.findUser(email, password);
		if (obj != null) {
			session.setAttribute("user", obj);
			if (obj instanceof User) {
				session.setAttribute("type", "user");
				return "redirect:/home";
			} else {
				session.setAttribute("type", "employee");
			}
			return "redirect:/admin/home";
		}
		model.addAttribute("result", "đăng nhập không thành công");
		return "login";
	}
}
