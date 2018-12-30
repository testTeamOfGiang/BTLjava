package com.nhom18.btljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = { "/", "/home" })
	public String home() {
		return "home";
	}

	@GetMapping(value = "/403")
	public String fail() {
		return "403";
	}
}
