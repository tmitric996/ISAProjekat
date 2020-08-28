package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.model.User;

public interface UserService {

	public List<User> findAll();
	public User findById(int id);
	public User findByemail(String un);
	
	User save(UserRequest u);
}
