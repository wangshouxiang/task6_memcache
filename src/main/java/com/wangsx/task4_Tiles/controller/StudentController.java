package com.wangsx.task4_Tiles.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import com.wangsx.task4_Tiles.model.*;
import com.wangsx.task4_Tiles.service.*;


@Controller
@RequestMapping(value="/student")
public class StudentController {
	@Resource
	private StudentService studentService;
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public ModelAndView insertStudent() {
		ModelAndView modelAndView = new ModelAndView();
		Student student = new Student();
		student.setStudentName("wangsx");
		student.setStudentAge(26);
		student.setCreateAt(new Date().getTime());
		student.setUpdateAt(new Date().getTime());
		student.setStudentId(2);
		studentService.insertStudent(student);
		System.out.println("插入学生后的ID:" + student.getId());
		modelAndView.addObject("student", student);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	/*@RequestMapping(value="/selectStudentById/{id}", method=RequestMethod.GET) 
	public ModelAndView selectStudentById(@PathVariable int id) {
		ModelAndView maView = new ModelAndView();
		Student student = studentService.selectStudentById(id);
		maView.addObject("student", student);   
		maView.setViewName("index");
		return maView;   
	}*/
	/*@RequestMapping(value="/updateStudentById/{id}/{profession}", method=RequestMethod.PUT)
	public ModelAndView updateStudentById(@PathVariable int id,@PathVariable String profession) {
		ModelAndView maView = new ModelAndView();
		Student student = studentService.selectStudentById(id);
		student.setStudentProfession(profession);
		maView.addObject("student", student);
		studentService.updateStudentById(student);
		maView.setViewName("index");
		return maView;   
	}*/
}

