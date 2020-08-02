package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.MedicinskiRadnici;

public interface MedicinskiRadniciService {

	public List<MedicinskiRadnici> findAll();
	public MedicinskiRadnici findById(int id);
	public List<MedicinskiRadnici> findLekari();
	public List<MedicinskiRadnici> findTehnicari();
	public MedicinskiRadnici save(MedicinskiRadnici mr);
	public void delete(int id);
	
}
