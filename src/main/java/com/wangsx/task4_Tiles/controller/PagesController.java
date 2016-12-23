package com.wangsx.task4_Tiles.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.task4_Tiles.model.Profession;
import com.wangsx.task4_Tiles.service.ClassesService;
import com.wangsx.task4_Tiles.service.ProfessionService;
import com.wangsx.task4_Tiles.service.StudentService;

@Controller
public class PagesController {
	@Autowired
	ProfessionService professionService;
	@Autowired       
	ClassesService classesService;
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/homePage")
	public String homePage(Model model,HttpServletRequest request,HttpServletResponse response) {
		int studentCount = studentService.getTotalStudentCount();
		model.addAttribute("studentCount", studentCount);
		model.addAttribute("content","home");
		return "home";
	}
	@RequestMapping("/u/professionPage")
	public ModelAndView profession() {
		ModelAndView modelAndView = new ModelAndView();
		Profession profession = professionService.selectProfessionById(2);
		int studentCount = classesService.findLearningCount(profession.getProfessionId());
		modelAndView.addObject("professionName", profession.getProfessionName());
		modelAndView.addObject("descProfession", profession.getDescProfession());
		modelAndView.addObject("growthCycle", profession.getGrowthCycle());
		modelAndView.addObject("company", profession.getCompany());
		modelAndView.addObject("precondition", profession.getPrecondition());
		modelAndView.addObject("studentCount", studentCount);
		modelAndView.addObject("content", "profession");
		modelAndView.setViewName("home");
		return modelAndView;
		
	}
}
