package app.ws.ettarak.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.ws.ettarak.requests.UserRequest;

@RestController
@RequestMapping("/users") 
public class UserController {

	@GetMapping
	public String getUsers() {
		
		return "get uers was called !";
	}
	
	@PostMapping
	public String createUser(@RequestBody UserRequest userRequest) {
		return "Create user was called !";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called !";
	}
	
	@DeleteMapping
	public String DeleteUser() {
		return "Delete user was called";
	}
	
}
