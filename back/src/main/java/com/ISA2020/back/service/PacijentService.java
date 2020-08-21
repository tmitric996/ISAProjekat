package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.Pacijent;

public interface PacijentService {

	public List<Pacijent> findAll();

	Pacijent save(Pacijent p);
}
