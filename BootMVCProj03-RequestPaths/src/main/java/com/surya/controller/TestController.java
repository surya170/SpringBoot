package com.surya.controller;

import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
 
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg;
	@Autowired
	private HttpSession ses;
	
	// @RequestMapping("/")
       @GetMapping
	public String showHome() {
		return "home";
	}
       

	/*@PostMapping
	public String showHome1() {
		return "home";
	}*/

	// @RequestMapping(value="/report",method=RequestMethod.GET)
	/*@GetMapping({ "/report", "/report1", "/report2" })
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport(-)");
		return "display";
	}*/

	/*@PostMapping("/report")
	//	@RequestMapping(value="/report",method=RequestMethod.POST)
	public String showReport1(Map<String, Object> map) {
		System.out.println("TestController.showReport1(-)");
		return "display1";
	}*/
       

   	// @RequestMapping(value="/report",method=RequestMethod.GET)
   	@GetMapping("/report")
   	public String showReport(Map<String, Object> map) {
   		System.out.println("TestController.showReport(-)");
   		System.out.println("Web App name::"+sc.getContextPath());
   		System.out.println("DS Logical name:"+cg.getServletName());
   		System.out.println("Session ID :"+ses.getId());
   	   	
   		return "display";
   	}

}
