package com.garreffd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/index")
	public String showIndex() {
		return "index";
	}
	
	@GetMapping("/createPoll")
	public String createPoll() {
		return "create-poll-form";
	}
}
