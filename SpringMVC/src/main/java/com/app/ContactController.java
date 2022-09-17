package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataFormModel(Model m) {
		
		m.addAttribute("Header","Welcome to page");
		m.addAttribute("Desc", "Home for programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
 
	
	//by using @requestParam()
	/*
	 * @RequestMapping(path= "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String email,
	 * 
	 * @RequestParam("name")String name,
	 * 
	 * @RequestParam("password")String password,Model model) {
	 * 
	 * System.out.println("User Email:"+email);
	 * System.out.println("UserName:"+name);
	 * 
	 * System.out.println("UserPassword:"+password);
	 * 
	 * model.addAttribute("name", name); model.addAttribute("email",email);
	 * model.addAttribute("password", password);
	 * 
	 * 
	 * 
	 * 
	 * return "success"; }
	 */
	@RequestMapping(path = "processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,  Model model)
	{
		
		System.out.println(user);
		// process
		//model.addAttribute("user", user);
		if(user.getName().isBlank())
		{
			return "redirect:/contact";
			
		}
		
		return "success";
	}
}
