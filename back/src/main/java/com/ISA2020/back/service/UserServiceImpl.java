package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.enumerations.UsersEnum;
import com.ISA2020.back.model.Authority;
import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.model.User;
import com.ISA2020.back.repository.UserRepository;

import net.bytebuddy.pool.TypePool.Empty;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	UserRepository userRepo;
	@Autowired
	PacijentServiceImpl pacijentService;
	@Autowired
	AuthorityService authService;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		return userRepo.findById(Integer.toUnsignedLong(id)).orElse(null);
	}

	@Override
	public User findByemail(String un) {
		List<User> users=findAll();
		for (User user: users) {
		if (user.getEmail().equals(un)) {
			return user;
			}	
		}
		return null;
	}

	@Override
	public User save(UserRequest u) {
		Pacijent pacijent= new Pacijent();
		pacijent.setEmail(u.getEmail());
		pacijent.setPassword(passwordEncoder.encode(u.getPassword()));
		pacijent.setIme(u.getFirstname());
		pacijent.setPrezime(u.getLastname());
		pacijent.setEnabled(true);
		List<Authority> auth = authService.findByname("ROLA_PACIJENT");
	
		pacijent.setAdresa(Integer.toUnsignedLong(u.getAdress()));
		pacijent.setDrzava(u.getCountry());
		pacijent.setJedinstveniBrOsiguranika(u.getJzbo());
		pacijent.setTipKorisnika(UsersEnum.PACIJENT);
		pacijent.setAuthorities(auth);
		return pacijentService.save(pacijent);
	
	}

}
