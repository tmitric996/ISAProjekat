package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.Authority;

public interface AuthorityService {

	Authority findById(Long id);
	//Authority findByName(String name);
	List<Authority> findByname(String name);
}
