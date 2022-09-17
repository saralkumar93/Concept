package com.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//Model
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("hello home");
		model.addAttribute("name","vipul kumar");
		model.addAttribute("id",123123);
		
		List<String> friends = new ArrayList<String>();
		friends.add("vipul");
		friends.add("amit");
		friends.add("sanjay");
		friends.add("sk");
		
		model.addAttribute("f",friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("hello about");
		return "about";
	}
	
	//ModelAndView
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("help page");
		// creting model and view object
		ModelAndView modelAndView= new ModelAndView();
		
		//setting data
		modelAndView.addObject("name", "vipul");
		modelAndView.addObject("rollNo",121212);
		
		LocalDateTime now = LocalDateTime.now();
		
		modelAndView.addObject("time",now);
		
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(111);
		list.add(1212);
		list.add(12345);
		list.add(1121);
		list.add(2222);
		list.add(22211112);
		modelAndView.addObject("marks",list);
		
		
		//setting the view name
	    modelAndView.setViewName("help");
		
	
		
		return modelAndView;
	}

}
