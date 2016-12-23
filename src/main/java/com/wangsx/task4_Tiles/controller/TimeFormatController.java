package com.wangsx.task4_Tiles.controller;

import javax.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.task4_Tiles.model.Student;
import com.wangsx.task4_Tiles.service.*;

@Controller
public class TimeFormatController {
	@Resource
	private StudentService studentService;
	
	@RequestMapping(value="/selectStudentById/{id}", method=RequestMethod.GET) 
	public ModelAndView selectStudentById(@PathVariable int id) {
		ModelAndView maView = new ModelAndView();
		Student student = studentService.selectStudentById(id);
		maView.addObject("time", student.getCreateAt());    
		maView.setViewName("timeFormat");
		return maView;   
	}
}
