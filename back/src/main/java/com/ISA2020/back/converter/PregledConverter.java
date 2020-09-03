package com.ISA2020.back.converter;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.response.PregledResponse;

import javax.persistence.PrePersist;
import java.util.ArrayList;
import java.util.List;

public class PregledConverter {

    public static PregledResponse toResponse(Pregled pregled){
        return new PregledResponse(pregled.getId(), pregled.getDatumVreme(), pregled.getKrajPregleda(), pregled.getTipPRegleda(), pregled.getDoktorKojiVrsi(), pregled.getBrojSale(), pregled.getPacijent(), pregled.getStatusPregleda(), pregled.getIzvestaj());
    }

    public static List<PregledResponse> toResponses(List<Pregled> pregledList){
        List<PregledResponse> pregledResponses = new ArrayList<>();
        for(Pregled pregled : pregledList){
            pregledResponses.add(toResponse(pregled));
        }

        return  pregledResponses;
    }

}
