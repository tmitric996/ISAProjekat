package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.repository.AdminKlinikeRepository;
import com.ISA2020.back.request.AdminKlinikeRequest;
import com.ISA2020.back.request.DijagnozaRequest;

public interface AdminKlinikeService {

	public List<AdminKlinike> findAll();
	public List<AdminKlinike> findAdminK();//trazi samo admine klinika
	public List<AdminKlinike> findAdminKC();//trazi samo admine klinickog centra
	public AdminKlinike findById(int id);
	public AdminKlinike save(AdminKlinike ak);
	public void delete(int id);

	public void dodaj(AdminKlinikeRequest adminKlinikeRequest);
	public List<AdminKlinike> getAll();
	void prihvati(Long id);
	void odbij(Long id, String message);
}
