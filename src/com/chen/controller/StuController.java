package com.chen.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chen.entity.Student;
import com.chen.service.IStudentService;

@Controller
public class StuController {
	
	@Autowired
	private IStudentService stuservice;
	 
	 @RequestMapping("/hello")
	    public String getStudent(HttpServletRequest request){     
		    String id = request.getParameter("id");
		   
		    Student s   = new Student();
		    s.setId(Integer.valueOf(id));
		    Student  stuim = stuservice.find(s);
		    request.setAttribute("name", stuim.getName());
		    System.out.println("name:"+stuim.getName());
	        return "findstu";  
	    }  
	    @RequestMapping("/")  
	    public String getIndex(){     
	        return "index";  
	    }  
}

