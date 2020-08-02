package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.AdminKlinike;

public interface AdminKlinikeService {

	public List<AdminKlinike> findAll();
	public List<AdminKlinike> findAdminK();//trazi samo admine klinika
	public List<AdminKlinike> findAdminKC();//trazi samo admine klinickog centra
	public AdminKlinike findById(int id);
	public AdminKlinike save(AdminKlinike ak);
	public void delete(int id);
}
