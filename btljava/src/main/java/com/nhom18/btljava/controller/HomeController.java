package com.nhom18.btljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nhom18.btljava.dao.SlideDao;

@Controller
public class HomeController {

	@Autowired
	SlideDao slideDao;

	@GetMapping(value = { "/", "/home" })
	public String home(Model model) {
		model.addAttribute("slides", slideDao.findAll());
		return "home";
	}

	@GetMapping(value = "/403")
	public String fail() {
		return "403";
	}
}
