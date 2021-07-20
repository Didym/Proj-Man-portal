package com.proma.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proma.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee anEmployee = new Employee();
		model.addAttribute("project", anEmployee);
		return "new-project";
	}
	
	@PostMapping("/save")
	public String createEmployee(Employee employee, Model model) {
		// for saving data to database
		empRepo.save(employee);
		return "redirect:/projects/new"; // use a redirect to prevent duplicate submissions
	}
	
	
	
	
	
	
	

}
