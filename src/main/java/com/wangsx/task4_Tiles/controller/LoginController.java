package com.wangsx.task4_Tiles.controller;
 
import java.io.IOException;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.task4_Tiles.model.Student;
import com.wangsx.task4_Tiles.service.StudentService;
import com.wangsx.task4_Tiles.util.DESUtil;
import com.wangsx.task4_Tiles.util.MD5Util;

 
@Controller 
public class LoginController {  
 
    @Resource 
    private StudentService studentService;  
 
    @RequestMapping("/login")    
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){   
        ModelAndView mav = new ModelAndView();    
        mav.setViewName("login");
        return mav;    
    }    
    @RequestMapping(value="/signIn",method=RequestMethod.POST)    
    public synchronized ModelAndView selectUserByPhone(HttpServletRequest request,HttpServletResponse response) throws Exception{   
        ModelAndView mav = new ModelAndView();   
        Long studentPhone = Long.valueOf(request.getParameter("studentPhone"));
        String password = request.getParameter("password");
        Student student = studentService.selectStudentByPhone(studentPhone);
        if(student != null) {
        	if(MD5Util.verify(password, student.getStudentPassword())) {
        		mav.addObject("message", "登录成功...");
        		//cookie中的Token介绍
        		String encryptPassword = "wsx12345";
    	        String DESAcount = DESUtil.encrypt(studentPhone+"", encryptPassword);
				//1小时(3600秒)cookie存活期
                Cookie accountCookie = new Cookie("userAcount", DESAcount);
                response.addCookie(accountCookie);
                //response.sendRedirect(request.getContextPath()+"/homePage");
        	}else{
        		mav.addObject("message", "输入密码错误...");
        		mav.addObject("judge", "1");
        	}
        }else{
        	mav.addObject("message", "输入手机号码错误...");
        	mav.addObject("judge", "1");
        }
        mav.setViewName("loginMessage");
        return mav;    
    }    
    
    @RequestMapping("/clearSession")    
    public void clearSession(HttpServletRequest request,HttpServletResponse response) 
    		throws IOException{   
    	 
    	//当退出时,删除cookie
    	 Cookie[] cookies = request.getCookies();
    	 for(Cookie cookie:cookies) {
    		 if(cookie.getName().equals("userAcount")){
					Cookie c = new Cookie("userAcount","");
					c.setMaxAge(0);
					response.addCookie(c);
					break;
				}
    	 }
    	 response.sendRedirect(request.getContextPath()+"/login");
    }    
    
    
    @RequestMapping("/cookies")    
    public void cookies(HttpServletRequest request,HttpServletResponse response){   
    	 Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
         if (null==cookies) {
             System.out.println("没有cookie=========");
         } else {
             for(Cookie cookie : cookies){
                 System.out.println("name:"+cookie.getName()+",value:"+ cookie.getValue());
             }
         }
          
    }    
}