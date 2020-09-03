package com.ISA2020.back.controller;

import java.security.Principal;
import java.util.List;

import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.User;
import com.ISA2020.back.service.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
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
	@PostMapping("/{email}")
	public ResponseEntity<User> findByEmail(@RequestBody String e, @Context HttpServletRequest request) {
		User user = userService.findByemail(e);
		 HttpSession session = request.getSession();
         System.out.println("\nSesija KorisnikData: " + session);
         return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/svi")
	public List<UserResponse> vratiSveKorisnike(@RequestParam(value = "tip", required = false) UsersEnum tip){
		return toResponses(userService.getAll(tip));
	}
	@GetMapping("/whoami")
	//@PreAuthorize("hasRole('USER')")
	public User user(User user) {
		System.out.println("usao u whoami");
		return this.userService.findByemail(user.getEmail());
	}
}
