package com.ISA2020.back.service;

import java.io.IOException;
import java.util.List;

import com.ISA2020.back.model.Sala;
import com.ISA2020.back.request.SalaRequest;
import com.ISA2020.back.response.SalaResponse;

public interface SalaService {

	public Sala saveSala(Sala sala);
	public List<Sala> findAll();
	public List<Sala> findSlobodne();
	public Sala findById(int i);
	public void deleteSala(int i) throws IOException;

	public List<Sala> getAll();
	public void dodaj(SalaRequest salaRequest);
}
