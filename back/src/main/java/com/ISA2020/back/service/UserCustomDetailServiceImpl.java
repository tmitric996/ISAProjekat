package com.ISA2020.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.User;
import com.ISA2020.back.repository.UserRepository;

@Service
public class UserCustomDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepo;
	@Autowired
	UserServiceImpl userService;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user= userService.findByemail(email);
		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with email '%s'.", email));
		} else {
			return user;
		}
	}

}
