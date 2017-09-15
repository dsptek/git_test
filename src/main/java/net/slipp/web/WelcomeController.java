package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/helloworld")	
	private String  welcome(String name, Model model) {
		model.addAttribute("name", name);
		System.out.println("name : " + name);
		return "welcome";
	}
}
