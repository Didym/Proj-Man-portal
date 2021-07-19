package com.proma.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proma.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee anEmployee = new Employee();
		model.addAttribute("project", anEmployee);
		return "new-project";
	}
	
	

}
