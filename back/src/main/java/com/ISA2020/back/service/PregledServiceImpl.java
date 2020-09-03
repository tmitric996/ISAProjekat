package com.ISA2020.back.service;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import com.ISA2020.back.request.PregledRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.repository.PregledRepository;

@Service
public class PregledServiceImpl implements PregledService{

	@Autowired
	PregledRepository pregledRepo;
	
	@Override
	public List<Pregled> findAll() {
		return pregledRepo.findAll();
	}

	@Override
	public Pregled save(Pregled p) {
		return pregledRepo.save(p);
	}

	@Override
	public Pregled findById(int id) {
		Long idi=Integer.toUnsignedLong(id);
		return pregledRepo.findById(idi).orElse(null);
	}

	@Override
	public void delete(int id) {
		Pregled p = findById(id);
		if (p!=null) {
			pregledRepo.delete(p);
		}
	}

	@Override
	public List<Pregled> getAll(){
		return pregledRepo.findAll();
	}

	@Override
	public void dodaj(PregledRequest pregledRequest){
		if(daLiJeZauzet(pregledRequest.getDoktorKojiVrsi(), pregledRequest.getDatumVreme(), pregledRequest.getKrajPregleda()) == true) {
			// TODO: 01/09/2020 vratiti gresku korisniku
		}
		Pregled pregled = new Pregled();
		pregled.setDatumVreme(pregledRequest.getDatumVreme());
		pregled.setKrajPregleda(pregledRequest.getKrajPregleda());
		pregled.setTipPRegleda(pregledRequest.getTipPRegleda());
		pregled.setDoktorKojiVrsi(pregledRequest.getDoktorKojiVrsi());
		pregled.setBrojSale(pregled.getBrojSale());
		pregled.setPacijent(pregledRequest.getPacijent());
		pregled.setStatusPregleda(pregledRequest.getStatusPregleda());
		pregled.setIzvestaj(pregledRequest.getIzvestaj());
		pregledRepo.save(pregled);
	}

	@Override
	public void izmeni(PregledRequest pregledRequest, Long id){
		Pregled pregled = pregledRepo.getOne(id);
		pregled.setIzvestaj(pregledRequest.getIzvestaj());
		pregledRepo.save(pregled);
	}

	private boolean daLiJeZauzet(Long id, ZonedDateTime pocetakPregleda, ZonedDateTime krajPregleda){
		List<Pregled> pregledList = pregledRepo.findAllByDoktorKojiVrsiAndDatumVremeAfterAndKrajPregledaBefore(id, ZonedDateTime.now().minusDays(1), ZonedDateTime.now().plusDays(1));
		for (Pregled pregled : pregledList) {
			if(pregled.getDatumVreme().isBefore(krajPregleda) && pregled.getKrajPregleda().isBefore(pocetakPregleda) && pocetakPregleda.isBefore(krajPregleda)){
				return true;
			}
		}
		return false;
	}

}
