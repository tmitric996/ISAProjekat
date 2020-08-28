package com.ISA2020.back.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Authority;
import com.ISA2020.back.repository.AuthorityRepository;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	AuthorityRepository authRepo;
	@Override
	public Authority findById(Long id) {
		return authRepo.findById(id).orElse(null);
	}

	@Override
	  public List<Authority> findByname(String name) {
	    List<Authority> authorities = this.authRepo.findAll();
	    List<Authority> auths = new ArrayList<>();
	    for (Authority au : authorities) {
	    	if (au.getName().equals(name)) {
	    		auths.add(au);
	    	}
	    }
	    
	    return auths;
	  }

}
