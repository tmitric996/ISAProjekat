package com.ISA2020.back.service;

import com.ISA2020.back.model.Operacija;
import com.ISA2020.back.repository.OperacijaRepository;
import com.ISA2020.back.repository.PacijentRepository;
import com.ISA2020.back.request.OperacijaRequest;
import com.ISA2020.back.request.PromenaDatumaRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperacijaService {
    private final OperacijaRepository operacijaRepository;
    private final PacijentRepository pacijentRepository;


    public OperacijaService(OperacijaRepository operacijaRepository, PacijentRepository pacijentRepository) {
        this.operacijaRepository = operacijaRepository;
        this.pacijentRepository = pacijentRepository;
    }

    public List<Operacija> getAll(){
        return operacijaRepository.findAll();
    }

    public void dodaj(OperacijaRequest operacijaRequest){
        Operacija operacija = new Operacija();
        operacija.setDatumVreme(operacijaRequest.getDatumVreme());
        operacija.setPacijent(pacijentRepository.getOne(operacijaRequest.getPacijentId()));
        operacijaRepository.save(operacija);
    }

    public void promeniDatum(PromenaDatumaRequest promenaDatumaRequest, Long id){
        Operacija operacija = operacijaRepository.getOne(id);
        operacija.setDatumVreme(promenaDatumaRequest.getNoviDatumVreme());
        operacijaRepository.save(operacija);
    }
}
