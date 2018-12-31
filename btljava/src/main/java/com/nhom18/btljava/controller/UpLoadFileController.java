package com.nhom18.btljava.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/upload")
public class UpLoadFileController {

	@Autowired
	ServletContext context;

	@PostMapping
	public @ResponseBody String upload(@RequestParam("img") MultipartFile img) {
		String updirName = context.getRealPath("images");
		System.out.println(updirName);
		File upfolder = new File(updirName);
		if (!upfolder.exists()) {
			upfolder.mkdirs();
		}
		File newFile = new File(updirName + "/" + img.getOriginalFilename());
		if (newFile.exists()) {
			return "file này đã tồn tại";
		}
		try {
			img.transferTo(newFile);
		} catch (IllegalStateException e) {

			return "upload file thất bại";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "upload file thất bại";
		}
		return "upload file thành công";
	}
}
