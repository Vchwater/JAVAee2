package com.cuit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView viewRegister() {
		
		ModelAndView model =new ModelAndView("login");
		model.addObject("test", "hello nihao!");
		return model;
	}
}
