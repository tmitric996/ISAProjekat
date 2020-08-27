package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.model.User;

public interface UserService {

	public List<User> findAll();
	public User findById(int id);
	public User findByemail(String un);

	List<User> getAll(UsersEnum tip);

}
