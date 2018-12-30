package com.nhom18.btljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@GetMapping(value = "/home")
	public String home() {
		return "homeadmin";
	}
}
