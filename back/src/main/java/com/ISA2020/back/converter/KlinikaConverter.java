package com.ISA2020.back.converter;

import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.response.KlinikaResponse;

import java.util.ArrayList;
import java.util.List;

public class KlinikaConverter {

    public static KlinikaResponse toResponse(Klinika klinika){
        return new KlinikaResponse(klinika.getId(), klinika.getNaziv(), klinika.getOpis(), klinika.getAdresa(), klinika.getPripadaKlinickomCentru(), klinika.getCenovnik(), klinika.getProsecnaOcena());
    }

    public static List<KlinikaResponse> toResponses(List<Klinika> klinikaList){
        List<KlinikaResponse> klinikaResponses = new ArrayList<>();
        for(Klinika klinika : klinikaList){
            klinikaResponses.add(toResponse(klinika));
        }

        return klinikaResponses;
    }
}
