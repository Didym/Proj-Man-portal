package com.proma.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proma.pma.dao.ProjectRepository;
import com.proma.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		return "new-project";
	}
	
	
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		// for saving data to database
		proRepo.save(project);
		return "redirect:/projects/new"; // use a redirect to prevent duplicate submissions
	}
	
	
	

}
