package com.RegistartionForm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.RegistartionForm.model.User;
import com.RegistartionForm.repositories.UserRepository;


@Controller
public class UserController {
    
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/registration")
	public String getRegPage(@ModelAttribute("user") User user) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@Valid @ModelAttribute("user") User user,BindingResult result , Model model) {

//		User validation for matching password
		if(!user.isPasswordsMatching()) {
			result.rejectValue("confirmpassword", "error.user", "Password Do Not Match...");
		}
		
//		Check if username already exists
		if(userRepository.existsById(user.getUsername())) {
			result.rejectValue("username", "error.user", "Username is Already Taken");
		}
		
		if(result.hasErrors()) {
			return "register";
		}
	
		userRepository.save(user);
		model.addAttribute("message", "Submitted Successfully");
		return "register";
	}
	
	@GetMapping("/users")
	public String usersPage(Model model) {
		List<User> listOfUsers = userRepository.findAll();
		model.addAttribute("user", listOfUsers);
		return "user";
	}
}
