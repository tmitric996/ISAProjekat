package com.ISA2020.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Cenovnik;
import com.ISA2020.back.repository.CenovnikRepository;

@Service
public class CenovnikServiceImpl implements CenovnikService {
	
	@Autowired
	CenovnikRepository cenovnikRepo;

	@Override
	public Cenovnik findbyId(int id) {
		return cenovnikRepo.findById(Integer.toUnsignedLong(id)).orElse(null);
	}

	@Override
	public Cenovnik findByKlinika(int idKlinike) {
		List<Cenovnik> temp=cenovnikRepo.findAll();
		for (Cenovnik c:temp) {
			if (c.getZaKliniku().equals(Integer.toUnsignedLong(idKlinike))) {
				return c;
			}
		}
		return null;
	}

	
}
