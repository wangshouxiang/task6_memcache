package com.wangsx.task4_Tiles.controller;

import java.util.Date;

import javax.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wangsx.task4_Tiles.model.Classes;
import com.wangsx.task4_Tiles.service.*;

@Controller
@RequestMapping(value="/classes")
public class ClassesController {
	@Resource
	private ClassesService classesService;
	@RequestMapping(value="/addClass",method=RequestMethod.POST)
	public ModelAndView insertClasses() {
		ModelAndView modelAndView = new ModelAndView();
		Classes classes = new Classes();
		classes.setClassId(8);
		classes.setClassName("线上");
		classes.setStudentSum(1);
		classes.setStudentId(1);
		classes.setProfessionId(2);
		classes.setCreateAt(new Date().getTime());
		classes.setUpdateAt(new Date().getTime());
		classesService.insertClasses(classes);
		modelAndView.addObject("classes", classes);
		modelAndView.setViewName("classes");
		return modelAndView;
	}
}
