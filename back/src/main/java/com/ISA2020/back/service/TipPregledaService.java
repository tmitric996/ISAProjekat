package com.ISA2020.back.service;

import java.io.IOException;
import java.util.List;

import com.ISA2020.back.model.TipPregleda;

public interface TipPregledaService {

	public List<TipPregleda> findAll();
	public TipPregleda findById(int id);
	public TipPregleda save(TipPregleda tp);
	public void delete(int id) throws IOException;
}
