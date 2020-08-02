package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.Pregled;

public interface PregledService {
	
	public List<Pregled> findAll();
	public Pregled save(Pregled p);
	public Pregled findById(int id);
	public void delete(int id);

}
