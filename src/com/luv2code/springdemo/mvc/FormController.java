package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("processForm")
	public String welcome(@RequestParam("studentName") String name,Model model) {
		
		model.addAttribute("name",name.toUpperCase());
		return "SubmitFormView";
	}
}
