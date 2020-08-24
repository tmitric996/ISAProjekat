package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.repository.PacijentRepository;

@Service
public class PacijentServiceImpl implements PacijentService{
	
	@Autowired
	PacijentRepository pacijentRepo;

	@Override
	public List<Pacijent> findAll() {
		return pacijentRepo.findAll();
	}
	//fali na gitu
	@Override 
	public Pacijent save(Pacijent p) {
		return pacijentRepo.save(p);
	}

}
