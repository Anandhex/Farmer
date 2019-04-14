package com.farmer.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutUsController {
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String showAboutUs() {
		return "about";
	}
}
