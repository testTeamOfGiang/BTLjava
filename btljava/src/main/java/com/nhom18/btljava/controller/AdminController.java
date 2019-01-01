package com.nhom18.btljava.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nhom18.btljava.dao.SlideDao;
import com.nhom18.btljava.model.Slide;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	ServletContext context;
	@Autowired
	SlideDao slideDao;

	@GetMapping(value = "/home")
	public String home() {
		return "homeadmin";
	}

	@GetMapping(value = "/slide")
	public String slide(Model model) {
		model.addAttribute("slides", slideDao.findAll());
		return "slide";
	}

	@PostMapping(value = "/addslide")
	public String slide(Model model, @ModelAttribute("slide") Slide slide, @RequestParam("img") MultipartFile img) {
		String updirname = context.getRealPath("images");
		System.out.println(updirname);
		File updir = new File(updirname);
		if (!updir.exists()) {
			updir.mkdirs();
		}
		model.addAttribute("slides", slideDao.findAll());
		File newfile = new File(updirname + "/" + img.getOriginalFilename());
		if (newfile.exists()) {
			model.addAttribute("result", "file đã tồn tại");
			model.addAttribute("reup", slide);
			return "slide";
		}
		try {
			img.transferTo(newfile);
		} catch (IllegalStateException e) {
			model.addAttribute("result", "thất bại");
			return "slide";
		} catch (IOException e) {
			model.addAttribute("result", "thất bại");
			return "slide";
		}
		slide.setSlideImage(img.getOriginalFilename());
		slideDao.save(slide);
		model.addAttribute("slides", slideDao.findAll());
		System.out.println("slide title: " + slide.getSlideTitle());
		System.out.println("slide content: " + slide.getSlideContent());
		model.addAttribute("result", "thêm thành công");
		return "slide";
	}
}
