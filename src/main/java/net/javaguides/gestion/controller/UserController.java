package net.javaguides.gestion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.gestion.entity.Users;
import net.javaguides.gestion.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}



	@GetMapping("/all")
	public List<Users> testApp() {
		return this.userService.getAllUsers();
	}
	
	
}