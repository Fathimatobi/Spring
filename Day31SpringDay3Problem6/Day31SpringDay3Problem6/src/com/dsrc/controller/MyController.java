package com.dsrc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dsrc.bean.Login;

import aj.org.objectweb.asm.Label;

@Controller
public class MyController {
	public MyController(){}
	
	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
		public ModelAndView student(Model model) {
		
  
 				return new ModelAndView("index","command",model);
		}

//	Sample login.htm action
	
	@RequestMapping("/success.htm")  
public String login(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("Login")Login log,ModelMap model) {
  
// If the loginname and password is "SA" and "PASS" go to "succes.jsp" page.
// Else  to error.jsp
		String name=request.getParameter("logname");
		String pass=request.getParameter("pass");
		if(name.equals("sa") && pass.equals("pass"))
		{
			 return "success";
		}
		else{
			
			 return "error";
	  }
	}

}
