package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.request.PregledRequest;

public interface PregledService {
	
	public List<Pregled> findAll();
	public Pregled save(Pregled p);
	public Pregled findById(int id);
	public void delete(int id);

	public List<Pregled> getAll();
	public void dodaj(PregledRequest pregledRequest);
	public void izmeni(PregledRequest pregledRequest, Long id);

}
