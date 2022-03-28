package app.ws.ettarak.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.ws.ettarak.requests.UserRequest;
import app.ws.ettarak.responses.UserResponse;
import app.ws.ettarak.services.UserService;
import app.ws.ettarak.shared.dto.UserDto;

@RestController
@RequestMapping("/users") 
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@GetMapping
	public String getUsers() {
		
		return "get uers was called !";
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDto createUser = userService.createUser(userDto);
		
		UserResponse userResponse = new UserResponse();
		
		BeanUtils.copyProperties(createUser, userResponse);
		
		return userResponse;
		
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
