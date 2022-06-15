package com.surya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.surya.service.IWishMessageService;

@Controller
public class WishMessageGeneratorController {
	
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
	   return "home";     // LVN
	}
	
	/*
	@RequestMapping("/wish")
	public ModelAndView generateMessage() {
		//use Service
		String result = service.generateWishMessage();
		//return mav
		
	    //  ModelAndView mav = new ModelAndView();   // Like These We Can Add any no:of Attributes
	    //  mav.addObject("wMsg",result);
	    //  mav.setViewName("display");
	     //  return mav;
	      
		return new ModelAndView("display","wMsg",result);        // Here we can add only one Model Attribute
	}    */
	
	/*@RequestMapping("/wish")
	public String generateMessage(HashMap<String,Object> map) {
		System.out.println("Shared Memory Class Name :: "+map.getClass());
		// use service 
		String result  = service.generateWishMessage();
	    map.put("wMsg", result);
		// return LVN
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(Map<String,Object> map) {
		System.out.println("Shared Memory Class Name :: "+map.getClass());
		// use service 
		String result  = service.generateWishMessage();
	    map.put("wMsg", result);
		// return LVN
		return "display";
	}
	*/
	/*@RequestMapping("/wish")
	public String generateMessage(Model model) {
		System.out.println("Shared Memory Class Name :: "+model.getClass());
		// use service 
		String result  = service.generateWishMessage();
	    model.addAttribute("wMsg", result);
		// return LVN
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public void generateMessage(Model model) {
		System.out.println("Shared Memory Class Name :: "+model.getClass());
		// use service 
		String result  = service.generateWishMessage();
	    model.addAttribute("wMsg", result);
	}*/
	
}
