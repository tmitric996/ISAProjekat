package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.GodisnjiOdmor;

public interface GodisnjiOdmorService {

	public GodisnjiOdmor save(GodisnjiOdmor go);
	public List<GodisnjiOdmor> findAll();
	public List<GodisnjiOdmor> findZaRadnika(int id);
}
