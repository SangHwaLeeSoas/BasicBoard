package org.soas.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class UserController {

	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/loginView")
	private void loginView() throws Exception {
		logger.info("GET loginView");
	}
	
	@GetMapping("/login")
	private String loginView2() throws Exception {
		logger.info("GET loginView2");
		
		return "loginView";
	}
}
