package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.User;
import com.ISA2020.back.service.UserServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User findById(@RequestBody int id) {
		return userService.findById(id);
	}
	@GetMapping("/{email}")
	public User findByEmail(@RequestBody String e) {
		return userService.findByemail(e);
	}
}
