package com.xero.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {

	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("project") ;
		return model;
	}
}
