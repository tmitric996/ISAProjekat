package com.ISA2020.back.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.TipPregleda;
import com.ISA2020.back.repository.TipPregledaRepository;
@Service
public class TipPregledaServiceImpl implements TipPregledaService {

	@Autowired
	TipPregledaRepository tipPregledaRepo;

	@Override
	public List<TipPregleda> findAll() {
		return tipPregledaRepo.findAll();
	}

	@Override
	public TipPregleda findById(int id) {
		Long idi=Integer.toUnsignedLong(id);
		return tipPregledaRepo.findById(idi).orElse(null);
	}

	@Override
	public TipPregleda save(TipPregleda tp) {
		return tipPregledaRepo.save(tp);
	}

	@Override
	public void delete(int id) throws IOException {
		TipPregleda tp=findById(id);
		if (!tp.isImaZakazan()) {
			tipPregledaRepo.delete(tp);
		}else {
			throw new IOException("postoji zakazan tip pregleda, ne moze biti izbrisan");
		}
	}
}
