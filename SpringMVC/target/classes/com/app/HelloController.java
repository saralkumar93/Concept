package com.app;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	public String display()
	{
		return "index";
	}

}
