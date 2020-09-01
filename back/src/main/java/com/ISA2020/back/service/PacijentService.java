package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.model.Pacijent;

public interface PacijentService {

	public List<Pacijent> findAll();
	Pacijent findById(Long id);
	//Pacijent save(Pacijent p);

	Pacijent save(UserRequest ur);
}
