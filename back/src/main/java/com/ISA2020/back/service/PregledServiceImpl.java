package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.repository.PregledRepository;

@Service
public class PregledServiceImpl implements PregledService{

	@Autowired
	PregledRepository pregledRepo;
	
	@Override
	public List<Pregled> findAll() {
		return pregledRepo.findAll();
	}

	@Override
	public Pregled save(Pregled p) {
		return pregledRepo.save(p);
	}

	@Override
	public Pregled findById(int id) {
		Long idi=Integer.toUnsignedLong(id);
		return pregledRepo.findById(idi).orElse(null);
	}

	@Override
	public void delete(int id) {
		Pregled p = findById(id);
		if (p!=null) {
			pregledRepo.delete(p);
		}
	}

}
