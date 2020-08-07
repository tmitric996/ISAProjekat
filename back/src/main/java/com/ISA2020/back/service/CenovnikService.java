package com.ISA2020.back.service;

import com.ISA2020.back.model.Cenovnik;

public interface CenovnikService {

	public Cenovnik findbyId(int id);
	public Cenovnik findByKlinika(int idKlinike);
}
