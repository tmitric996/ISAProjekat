package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.model.User;
import com.ISA2020.back.request.AdminKlinikeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.repository.AdminKlinikeRepository;
import org.springframework.web.bind.annotation.RequestBody;

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


	@Override
	public List<AdminKlinike> getAll() {
		return adminKlinikeRepo.findAll();
	}

	public AdminKlinikeServiceImpl(AdminKlinikeRepository adminKlinikeRepository){
		this.adminKlinikeRepo = adminKlinikeRepository;
	}
	@Override
	public void dodaj(AdminKlinikeRequest adminKlinikeRequest){
		AdminKlinike adminKlinike = new AdminKlinike();
		adminKlinike.setIme(adminKlinikeRequest.getIme());
		adminKlinike.setPrezime(adminKlinikeRequest.getPrezime());
		adminKlinike.setTelefon(adminKlinikeRequest.getTelefon());
		adminKlinike.setKlinikaKojuOdrzava(adminKlinikeRequest.getKlinikaKojuOdrzava());
		adminKlinike.setPrvoLogovanje(false);
		adminKlinike.setEmail(adminKlinikeRequest.getEmail());
		adminKlinike.setPassword("password");
		adminKlinike.setTipKorisnika(UsersEnum.ADMIN_KLINIKE);
		adminKlinikeRepo.save(adminKlinike);
	}

	@Override
	public void prihvati(Long id) {

		AdminKlinike adminKlinike= adminKlinikeRepo.getOne(id);
		adminKlinike.setTipKorisnika(UsersEnum.PACIJENT);
		adminKlinikeRepo.save(adminKlinike);
	}

	//odbijanje registracije korisnika
	@Override
	public void odbij(Long id, String message){
		AdminKlinike adminKlinike = adminKlinikeRepo.findById(id).get();
		adminKlinikeRepo.delete(adminKlinike);
		// TODO: 26/08/2020 email servis
	}
}
