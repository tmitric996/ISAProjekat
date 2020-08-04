package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.repository.AdminKlinikeRepository;
@Service
public class AdminKlinikeServiceImpl implements AdminKlinikeService {

	@Autowired
	AdminKlinikeRepository adminKlinikeRepo;
	
	@Override
	public List<AdminKlinike> findAll() {
		return adminKlinikeRepo.findAll();
	}

	@Override
	public List<AdminKlinike> findAdminK() {
		return adminKlinikeRepo.findAdminiK();
	}

	@Override
	public List<AdminKlinike> findAdminKC() {
		return adminKlinikeRepo.findAdminiKC();
	}

	@Override
	public AdminKlinike findById(int id) {
		Long idi=Integer.toUnsignedLong(id);
		return adminKlinikeRepo.findById(idi).orElse(null);
	}

	@Override
	public AdminKlinike save(AdminKlinike ak) {
		return adminKlinikeRepo.save(ak);
	}

	@Override
	public void delete(int id) {
		AdminKlinike ak=findById(id);
		if (ak!=null) {
			adminKlinikeRepo.delete(ak);
		}
	}

}
