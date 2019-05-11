package xyz.profilioweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xyz.profilioweb.forms.UserRegistrationForm;
import xyz.profilioweb.service.UserRegistrationService;
import xyz.profilioweb.utils.DateUtils;

@Controller
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;
	DateUtils du = new DateUtils();
	
	@RequestMapping(value = "index.html")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value = "registertheuser.html", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userRegistration") UserRegistrationForm userRegistrationForm) {
		userRegistrationService.saveUsers(userRegistrationForm);
		ModelAndView mv = new ModelAndView();
		mv.addObject("userRegisteredSuccessfully", "Registration is successful");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "")
	public String firstPage() {
		return "index";
	}
}
