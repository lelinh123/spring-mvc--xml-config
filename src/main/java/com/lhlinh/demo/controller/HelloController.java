package com.lhlinh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
//	 @RequestMapping("/")
//	  public String index() {
//	    return "index";
//	  }
	  @RequestMapping(value = "/hello", method = RequestMethod.GET)
	  public String hello(Model model) {
		  model.addAttribute("msg", "Hello word 111");
	    return "hello";
	  }
	  
	  @RequestMapping(value = "/")
		public String index() {
			return "index";
		}

}
