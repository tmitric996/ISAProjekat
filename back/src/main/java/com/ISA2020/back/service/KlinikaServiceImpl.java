package com.ISA2020.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.repository.KlinikaRepository;

@Service
public class KlinikaServiceImpl implements KlinikaService{
	
	@Autowired
	KlinikaRepository klinikaRepo;
	
	@Override
	public Klinika saveKlinika(Klinika k) {
		return klinikaRepo.save(k);
	}

}
