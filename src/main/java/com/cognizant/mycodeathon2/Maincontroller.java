package com.cognizant.mycodeathon2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.mycodeathon2.User;
import com.cognizant.mycodeathon2.UserRepository;

@SuppressWarnings("unused")
@Controller   
@RequestMapping(path="/demo") 
public class Maincontroller {
	@Autowired 
	          
	private UserRepository userRepository;

	

	@GetMapping(path="/balance")
	public @ResponseBody Iterable<User> getAllUsers() {
		
		return userRepository.findAll();
	}
	
	
	
}


