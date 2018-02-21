package com.garreffd.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garreffd.entity.Hangout;
import com.garreffd.entity.Poll;
import com.garreffd.entity.Suggestion;
import com.garreffd.service.HangoutService;

@Controller
@RequestMapping("/hangout")
public class HangoutController {
	
	@Autowired
	HangoutService<Hangout> hangoutService;
	
	@GetMapping("/showForm")
	public String showHangout(Model model) {
		//Need to bind model attribute, this will be Hangout.java
		Hangout hangout = new Hangout();
		
		model.addAttribute("hangout", hangout);
		
		Hangout hangoutTest = hangoutService.get(10);
		System.out.println(hangoutTest);
		System.out.println(hangoutTest.getPolls());
		
		return "form-create-hangout"; 
	}
	
	//Save a Hangout entity into the DB and redirect to front page.
	@GetMapping("/save")
	public String saveHangout(@ModelAttribute("hangout") Hangout hangout, @RequestParam Map<String, String> params) {
		String s1 = params.get("suggestion1");
		String s2 = params.get("suggestion2");
		String s3 = params.get("suggestion3");

		String pollTitle = params.get("pollTitle");
	
		Poll poll = new Poll(pollTitle);
		
		poll.addSuggestions(new Suggestion(s1));
		poll.addSuggestions(new Suggestion(s2));
		poll.addSuggestions(new Suggestion(s3));
		
		hangout.addPoll(poll);
		//Save hangout
		hangoutService.save(hangout);
		
		return "redirect:/";
	}
	
	@GetMapping("/showHangout")
	public String showHangout() {
		return "view-hangout";
	}
}
