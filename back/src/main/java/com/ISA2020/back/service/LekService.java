package com.ISA2020.back.service;

import com.ISA2020.back.model.Lek;
import com.ISA2020.back.repository.LekRepository;
import com.ISA2020.back.repository.MedicinskiRadniciRepository;
import com.ISA2020.back.request.LekRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LekService {

    private final LekRepository lekRepository;
    private final MedicinskiRadniciRepository medicinskiRadniciRepository;

    public LekService(LekRepository lekRepository, MedicinskiRadniciRepository medicinskiRadniciRepository) {
        this.lekRepository = lekRepository;
        this.medicinskiRadniciRepository = medicinskiRadniciRepository;
    }

    public List<Lek> getAll(){
        return lekRepository.findAll();
    }

    public void dodaj(LekRequest lekRequest){
        Lek lek = new Lek();
        lek.setIme(lekRequest.getIme());
        lek.setSifra(lekRequest.getSifra());
        lek.setOveren(false);
        lekRepository.save(lek);
    }

    public void overi(Long id, Long idOverivaca){
        Lek lek = lekRepository.getOne(id);
        lek.setOverenOdStrane(medicinskiRadniciRepository.getOne(idOverivaca));
        lek.setOveren(true);
        lekRepository.save(lek);
    }
}
