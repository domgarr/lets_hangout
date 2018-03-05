package com.garreffd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garreffd.entity.Hangout;
import com.garreffd.entity.HangoutUser;
import com.garreffd.entity.Poll;
import com.garreffd.entity.Suggestion;
import com.garreffd.service.HangoutService;
import com.garreffd.service.ServiceInterface;

@Controller
@RequestMapping("/hangout")
public class HangoutController {
	
	@Autowired
	ServiceInterface<Hangout> hangoutService;
	@Autowired
	ServiceInterface<HangoutUser> hangoutUserService;
	
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		Hangout hangout = new Hangout();
		model.addAttribute("hangout", hangout);
		return "form-create-hangout"; 
	}
	
	//Save a Hangout entity into the DB and redirect to front page.
	@GetMapping("/save")
	public String saveHangout(@ModelAttribute("hangout") Hangout hangout, @RequestParam Map<String, String> params) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

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
		
		HangoutUser hangoutUser = new HangoutUser(hangout.getId(), authentication.getName());
		
		System.out.println(hangoutUser.toString());
		hangoutUserService.save(hangoutUser);
		
		
		//TODO: Redirect to newly created hangout
		return "redirect:/";
	}
	
	@GetMapping("/showHangout")
	public String showHangout(Model model) {
		//get hangout from database
		Hangout hangout = hangoutService.get(12);
		
		//set hang out as a model attribute
		model.addAttribute("hangout", hangout);
		//send over to page
		model.addAttribute("poll", hangout.getPoll(0));
		
		return "/view-hangout";
	}
	
	@GetMapping("/")
	public String showHome(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		//Get a list of hangouts associated with the user.
		hangoutService.getAll(username);
		ArrayList<Hangout> hangouts = (ArrayList<Hangout>)hangoutService.getAll(username);			
		model.addAttribute("hangouts", hangouts);
	
		return "index";
	}
}
