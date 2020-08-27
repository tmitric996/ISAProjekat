package com.ISA2020.back.service;

import java.util.List;

import com.ISA2020.back.request.GodisnjiOdmorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.repository.GodisnjiOdmorRepository;

@Service
public class GodisnjiOdmorServiceImpl implements GodisnjiOdmorService {
	@Autowired
	GodisnjiOdmorRepository godisnjiOdmorRepo;

	@Override
	public GodisnjiOdmor save(GodisnjiOdmor go) {
		return godisnjiOdmorRepo.save(go);
	}

	@Override
	public List<GodisnjiOdmor> findAll() {
		return godisnjiOdmorRepo.findAll();
	}

	@Override
	public List<GodisnjiOdmor> findZaRadnika(int id) {
		List<GodisnjiOdmor> temp=findAll();
		for (GodisnjiOdmor go: temp) {
			if (!go.getZaRadnika().equals(Integer.toUnsignedLong(id))) {
				temp.remove(go);
			}
		}
		return temp;
	}

	@Override
	public List<GodisnjiOdmor> getAll(){
		return godisnjiOdmorRepo.findAll();
	}

	@Override
	public void dodaj(GodisnjiOdmorRequest godisnjiOdmorRequest, Long id){
		GodisnjiOdmor godisnjiOdmor = new GodisnjiOdmor();
		godisnjiOdmor.setZaRadnika(godisnjiOdmorRequest.getZaRadnika());
		godisnjiOdmor.setDatumPocetka(godisnjiOdmorRequest.getDatumPocetka());
		godisnjiOdmor.setDatumZavrsetka(godisnjiOdmorRequest.getDatumZavrsetka());
		godisnjiOdmor.setStatusGodisnjeg(godisnjiOdmorRequest.getStatusGodisnjeg());
		godisnjiOdmorRepo.save(godisnjiOdmor);
	}

	
	
}
