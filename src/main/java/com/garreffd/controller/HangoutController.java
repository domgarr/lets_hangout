package com.garreffd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hangout")
public class HangoutController {
	
	@GetMapping("/showForm")
	public String createHangout() {
		return "create-poll-form"; 
	}
}
