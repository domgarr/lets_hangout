package com.garreffd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Hangout;

@Controller
@RequestMapping("/hangout")
public class HangoutController {
	
	@GetMapping("/showForm")
	public String showHangout(Model model) {
		//Need to bind model attribute, this will be Hangout.java
		Hangout hangout = new Hangout();
		
		model.addAttribute("hangout", hangout);
		
		return "form-create-hangout"; 
	}
	
	//Save a Hangout entity into the DB and redirect to front page.
	@GetMapping("/save")
	public String saveHangout(@ModelAttribute("hangout") Hangout hangout) {
		
		//Save hangout
		
		return "redirect:hangout";
	}
}