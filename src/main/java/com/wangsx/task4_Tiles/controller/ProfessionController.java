package com.wangsx.task4_Tiles.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import com.wangsx.task4_Tiles.model.*;
import com.wangsx.task4_Tiles.service.*;

@Controller
@RequestMapping(value="/profession")
public class ProfessionController {
	@Resource
	private ProfessionService professionService;
	
	@RequestMapping(value="/addProfession", method=RequestMethod.POST)
	public ModelAndView insertProfession() {
		ModelAndView modelAndView = new ModelAndView();
		Profession profession = professionService.selectProfessionById(2);
		profession.setProfessionName("Web前端开发工程师");
		profession.setCreateAt(new Date().getTime());
		profession.setUpdateAt(new Date().getTime());
		profession.setProfessionCategory("前端开发");
		profession.setDescProfession("Web前端开发工程师，主要职责是利用(X)HTML/CSS/JavaScript/flash等各种Web技术进行产品的开发。");
		profession.setGrowthCycle("1-3");
		profession.setCompany(666);
		profession.setPrecondition("提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础");
		professionService.insertProfession(profession);
		modelAndView.addObject("profession",profession);
		modelAndView.setViewName("profession");
		return modelAndView;
	}
	@RequestMapping(value="/updateProfession")
	public ModelAndView updateProfession() {
		ModelAndView modelAndView = new ModelAndView();
		Profession profession = professionService.selectProfessionById(2);
		profession.setProfessionName("Web前端开发工程师");
		profession.setCreateAt(new Date().getTime());
		profession.setUpdateAt(new Date().getTime());
		profession.setProfessionCategory("前端开发");
		profession.setDescProfession("Web前端开发工程师，主要职责是利用(X)HTML/CSS/JavaScript/flash等各种Web技术进行产品的开发。");
		profession.setGrowthCycle("1-3");
		profession.setCompany(666);
		profession.setPrecondition("提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础");
		professionService.updateProfessionById(profession);
		modelAndView.addObject("profession",profession);
		modelAndView.setViewName("profession");
		return modelAndView;
	}
}
