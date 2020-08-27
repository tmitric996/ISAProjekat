package com.ISA2020.back.service;

import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.request.KlinikaRequest;

import java.util.List;

public interface KlinikaService {

	public Klinika saveKlinika(Klinika k);

	public List<Klinika> getAll();
	public void dodaj(KlinikaRequest klinikaRequest);
}
