package com.virakvoan.demo.cotroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/**")
	public String helloWorld(@RequestParam(value="name", defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "Hello User !!";
		
		
	}
}
