package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.User;
import com.ISA2020.back.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		return userRepo.findById(Integer.toUnsignedLong(id)).orElse(null);
	}

	@Override
	public User findByemail(String un) {
		List<User> users=findAll();
		for (User user: users) {
		if (user.getEmail().equals(un)) {
			return user;
			}	
		}
		return null;
	}

}
