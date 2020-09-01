package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.model.Authority;
import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.repository.PacijentRepository;

@Service
public class PacijentServiceImpl implements PacijentService{
	
	@Autowired
	AuthorityService authService;
	@Autowired
	PacijentRepository pacijentRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public List<Pacijent> findAll() {
		return pacijentRepo.findAll();
	}
	@Override 
	public Pacijent save(UserRequest ur) {
		Pacijent p=new Pacijent();
		p.setAdresa(Integer.toUnsignedLong((ur.getAdresa())));
		p.setDrzava(ur.getDrzava());
		p.setEmail(ur.getEmail());
		p.setPassword(passwordEncoder.encode(ur.getPassword()));
		p.setIme(ur.getIme());
		p.setPrezime(ur.getPrezime());
		p.setEnabled(true);
		List<Authority> auth = authService.findByname("ROLA_PACIJENT");
		p.setJedinstveniBrOsiguranika(ur.getJedinstveniBrOsiguranika());
		p.setTipKorisnika(UsersEnum.PACIJENT);
		p.setAuthorities(auth);
		return pacijentRepo.save(p);
	}
	@Override
	public Pacijent findById(Long id) {
		return pacijentRepo.findById(id).orElse(null);
	}

}
