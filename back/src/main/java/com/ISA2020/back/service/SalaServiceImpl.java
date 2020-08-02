package com.ISA2020.back.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Sala;
import com.ISA2020.back.repository.SalaRepository;

@Service
public class SalaServiceImpl implements SalaService{
	
	@Autowired
	SalaRepository salaRepo;
	
	@Override
	public Sala saveSala(Sala sala) {
		return salaRepo.save(sala);
	}
	
	@Override
	public List<Sala> findAll(){
		return salaRepo.findAll();
	}

	
	@Override
	public List<Sala> findSlobodne() {
		return salaRepo.findSlobodna(true);
	}

	@Override
	public Sala findById(int i) {
		Long idi=Integer.toUnsignedLong(i);
		return salaRepo.findById(idi).orElse(null);
	}

	//dodati proveru pre brisanja
	@Override
	public void deleteSala(int i) throws IOException {
		Long idi=Integer.toUnsignedLong(i);
		Sala temp= salaRepo.findById(idi).get();
		if (temp.isSlobodna()) {
		salaRepo.deleteById(idi);
		} else {
			throw new IOException("sala nije slobodna, ne moze biti izbrisana");
		}
	}
	

}
