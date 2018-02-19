package com.garreffd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hangout")
public class HangoutController {
	
	@GetMapping("/showForm")
	public String showHangout() {
		return "form-create-hangout"; 
	}
	
	//Save a Hangout entity into the DB and redirect to front page.
	@GetMapping("/save")
	public String saveHangout() {
		return "redirect:hangout";
	}
}
