package xyz.profilioweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistrationController {

	@RequestMapping(value = "index.html")
	public String indexPage() {
		return "index";
	}
	@RequestMapping(value = "")
	public String firstPage() {
		return "index";
	}
}
