package com.ISA2020.back.service;

import com.ISA2020.back.model.Dijagnoza;
import com.ISA2020.back.repository.DijagnozaRepository;
import com.ISA2020.back.request.DijagnozaRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DijagnozaService {

    private final DijagnozaRepository dijagnozaRepository;

    public DijagnozaService(DijagnozaRepository dijagnozaRepository) {

        this.dijagnozaRepository = dijagnozaRepository;
    }

    public List<Dijagnoza> getAll() {
        return dijagnozaRepository.findAll();
    }

    public void dodaj(DijagnozaRequest dijagnozaRequest){
        Dijagnoza dijagnoza = new Dijagnoza();
        dijagnoza.setIme(dijagnozaRequest.getIme());
        dijagnoza.setSifra(dijagnozaRequest.getSifra());
        dijagnozaRepository.save(dijagnoza);
    }
}
