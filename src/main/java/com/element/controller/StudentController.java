package com.element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.element.bind.Student;

@Controller
public class StudentController {
	
	@GetMapping("/load")
	public String loadRegForm() {
		return "regForm";
	}
	
	@PostMapping("/student")
	public String stuReg(Student student,Model model) {
		System.out.println(student);
		model.addAttribute("s",student.getName());
		return "success";
		
	}

}
