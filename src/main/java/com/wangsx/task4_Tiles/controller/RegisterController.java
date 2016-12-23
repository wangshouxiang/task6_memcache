package com.wangsx.task4_Tiles.controller;
 
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.task4_Tiles.model.Student;
import com.wangsx.task4_Tiles.service.StudentService;
import com.wangsx.task4_Tiles.util.MD5Util;

 
@Controller 
public class RegisterController {  
 
    @Resource 
    private StudentService studentService;  
    
    @RequestMapping("/register")    
    public ModelAndView register(){   
        ModelAndView mav = new ModelAndView();    
        mav.setViewName("register");
        return mav;    
    }    
    
    @RequestMapping(value="/signUp",method=RequestMethod.POST)
    public ModelAndView insertUser(HttpServletRequest request,HttpServletResponse response ) {
    	ModelAndView modelAndView = new ModelAndView();
    	Long studentIphone = Long.valueOf(request.getParameter("studentPhone"));
    	String password = request.getParameter("password");
    	String repassword = request.getParameter("repassword");
    	Student student = new Student();
    	if((password!=null||repassword!=null)&&password.equals(repassword)) {
    		String savepassword = MD5Util.generate(password);
    		student.setStudentIphone(studentIphone);
    		student.setStudentPassword(savepassword);
    		student.setCreateAt(new Date().getTime());
    		student.setUpdateAt(new Date().getTime());
    		student.setStudentId(studentService.getTotalStudentCount()+1);
    		System.out.println("插入前学生的ID:" + student.getId());
    		studentService.insertStudent(student);
    		System.out.println("插入后学生的ID:" + student.getId());
    		modelAndView.addObject("message", "注册成功!请登录...");
    		modelAndView.addObject("judge", "1");
    	}else {
			modelAndView.addObject("message", "两次输入的密码不同,请重新注册...");
			modelAndView.addObject("judge", "0");
		}
		modelAndView.setViewName("registerMessage");
		return modelAndView;
		
    }
}