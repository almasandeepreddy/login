package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserAdminController {

	@RequestMapping(method = RequestMethod.GET)
	String home(ModelMap modal) {
		modal.addAttribute("title","Create User Example");
		return "index";
	}

	@RequestMapping("partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}

}
