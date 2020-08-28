package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.request.GodisnjiOdmorRequest;

public interface GodisnjiOdmorService {

	public GodisnjiOdmor save(GodisnjiOdmor go);
	public List<GodisnjiOdmor> findAll();
	public List<GodisnjiOdmor> findZaRadnika(int id);

	public List<GodisnjiOdmor> getAll();
	public void dodaj(GodisnjiOdmorRequest godisnjiOdmorRequest, Long id);
}
