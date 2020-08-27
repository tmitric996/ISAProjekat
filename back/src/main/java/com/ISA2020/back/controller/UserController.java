package com.ISA2020.back.controller;

import java.util.List;

import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.User;
import com.ISA2020.back.service.UserServiceImpl;

import javax.validation.Valid;

import static com.ISA2020.back.converter.UserConverter.toResponses;

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

	@GetMapping("/svi")
	public List<UserResponse> vratiSveKorisnike(@RequestParam(value = "tip", required = false) UsersEnum tip){
		return toResponses(userService.getAll(tip));
	}

}
