package xyz.profilioweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xyz.profilioweb.model.Users;
import xyz.profilioweb.service.UserRegistrationService;

@Controller
public class AjaxController {
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@RequestMapping(value = "ajaxCheck.html", method = RequestMethod.POST)
	public ModelAndView duplicateUser(@RequestParam("username") String username) {
		StringBuffer  stb = new StringBuffer();
		Users users = userRegistrationService.findByUsername(username);
		if(users != null) {
			stb.append("userAlreadyPresent");
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("valueField", stb.toString());
		mv.setViewName("ajaxCheck");
		return mv;
	}
	
}
