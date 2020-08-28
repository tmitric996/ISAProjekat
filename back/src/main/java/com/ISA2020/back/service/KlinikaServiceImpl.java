package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.request.KlinikaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.model.MedicinskiRadnici;
import com.ISA2020.back.model.Sala;
import com.ISA2020.back.repository.KlinikaRepository;

@Service
public class KlinikaServiceImpl implements KlinikaService{
	
	@Autowired
	KlinikaRepository klinikaRepo;
	@Autowired
	MedicinskiRadniciServiceImpl medRadniciService;
	@Autowired
	SalaServiceImpl salaService;
	@Autowired
	AdminKlinikeServiceImpl adminService;
	
	@Override
	public Klinika saveKlinika(Klinika k) { //save i update
		return klinikaRepo.save(k);
	}
	
	//vraca lekare zaposlene na klinici sa idjem poslatim ??
	public List<MedicinskiRadnici> getLekari(int idKlinike){
		List<MedicinskiRadnici> temp=medRadniciService.findLekari();
		for (MedicinskiRadnici mr: temp) {
			if (!mr.getKlinikaUKojojSuZaposleni().equals(Integer.toUnsignedLong(idKlinike))){
				temp.remove(mr);
			}
		}
		return temp;
	}
	
	//vraca tehnicare zaposlene na klinici sa idijem poslatim ??
	public List<MedicinskiRadnici> geTehnicari(int idKlinike){
		List<MedicinskiRadnici> temp=medRadniciService.findTehnicari();
		for (MedicinskiRadnici mr: temp) {
			if (!mr.getKlinikaUKojojSuZaposleni().equals(Integer.toUnsignedLong(idKlinike))){
				temp.remove(mr);
			}
		}
		return temp;
	}
	
	//vraca listu sala klinike?? 
	public List<Sala> getSale(int idKlinike){
		List<Sala> temp=salaService.findAll();
		for (Sala s: temp) {
			if (!s.getNaKlinici().equals(Integer.toUnsignedLong(idKlinike))){
				temp.remove(s);
			}
		}
		return temp;
	}
	
	//vraca listu admina koji odrzavaju kliniku sa poslatim idijem??
	public List<AdminKlinike> getAdmini(int idKlinike){
		List<AdminKlinike> temp=adminService.findAdminK();
		for (AdminKlinike ak: temp) {
			if (!ak.getKlinikaKojuOdrzava().equals(Integer.toUnsignedLong(idKlinike))){
				temp.remove(ak);
			}
		}
		return temp;
	}

	@Override
	public List<Klinika> getAll(){
		return klinikaRepo.findAll();
	}

	@Override
	public void dodaj(KlinikaRequest klinikaRequest){
		Klinika klinika = new Klinika();
		klinika.setNaziv(klinikaRequest.getNaziv());
		klinika.setOpis(klinikaRequest.getOpis());
		klinika.setAdresa(klinikaRequest.getAdresa());
		klinika.setPripadaKlinickomCentru(klinikaRequest.getPripadaKlinickomCentru());
		klinika.setProsecnaOcena(klinikaRequest.getProsecnaOcena());
		klinikaRepo.save(klinika);
	}

}
