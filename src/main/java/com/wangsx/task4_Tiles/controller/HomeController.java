package com.wangsx.task4_Tiles.controller;

import javax.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.task4_Tiles.model.Profession;
import com.wangsx.task4_Tiles.service.*;

@Controller
public class HomeController {
	@Resource
	private StudentService studentService;
	@Resource
	private ProfessionService professonService;
	@Resource
	private ClassesService classesService;
	
	@RequestMapping(value="/home")
	public ModelAndView getTotalStudentCount() {
		ModelAndView modelAndView = new ModelAndView();
		int studentCount = studentService.getTotalStudentCount();
		modelAndView.addObject("studentCount", studentCount);
		modelAndView.setViewName("task10-home");
		return modelAndView;
	}
	@RequestMapping(value="/selectProfession")
	public ModelAndView selectProfession() {
		ModelAndView modelAndView = new ModelAndView();
		Profession profession = professonService.selectProfessionById(2);
		int studentCount = classesService.findLearningCount(profession.getProfessionId());
		modelAndView.addObject("professionName", profession.getProfessionName());
		modelAndView.addObject("descProfession", profession.getDescProfession());
		modelAndView.addObject("growthCycle", profession.getGrowthCycle());
		modelAndView.addObject("company", profession.getCompany());
		modelAndView.addObject("precondition", profession.getPrecondition());
		modelAndView.addObject("studentCount", studentCount);
		modelAndView.setViewName("task11-home");
		return modelAndView;
	}
}
