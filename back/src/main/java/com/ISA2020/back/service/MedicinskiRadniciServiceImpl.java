package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.MedicinskiRadnici;
import com.ISA2020.back.repository.MedicinskiRadniciRepository;

@Service
public class MedicinskiRadniciServiceImpl implements MedicinskiRadniciService{

	@Autowired
	MedicinskiRadniciRepository medRadniciRepo;
	
	@Override
	public List<MedicinskiRadnici> findAll() {
		return medRadniciRepo.findAll();
	}

	@Override
	public MedicinskiRadnici findById(int id) {
		Long idi=Integer.toUnsignedLong(id);
		return medRadniciRepo.findById(idi).orElse(null);
	}

	@Override
	public List<MedicinskiRadnici> findLekari() {
		return medRadniciRepo.findLekari();
	}

	@Override
	public List<MedicinskiRadnici> findTehnicari() {
		return medRadniciRepo.findTehnicari();
	}

	@Override
	public MedicinskiRadnici save(MedicinskiRadnici mr) {
		return medRadniciRepo.save(mr);
	}

	@Override
	public void delete(int id) {
		Long idi=Integer.toUnsignedLong(id);
		MedicinskiRadnici mr=medRadniciRepo.findById(idi).orElse(null);
		if (mr!=null) {
			medRadniciRepo.delete(mr);
		}
	}

}
