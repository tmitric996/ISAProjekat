package com.ISA2020.back.service;

import java.io.IOException;
import java.util.List;

import com.ISA2020.back.model.Sala;

public interface SalaService {

	public Sala saveSala(Sala sala);
	public List<Sala> findAll();
	public List<Sala> findSlobodne();
	public Sala findById(int i);
	public void deleteSala(int i) throws IOException;
}
