package com.ISA2020.back.converter;

import com.ISA2020.back.model.Dijagnoza;
import com.ISA2020.back.response.DijagnozaResponse;

import java.util.ArrayList;
import java.util.List;

public class DijagnozaConverter {

    public static DijagnozaResponse toResponse(Dijagnoza dijagnoza){
        return new DijagnozaResponse(dijagnoza.getId(), dijagnoza.getIme(), dijagnoza.getSifra());
    }

    public static List<DijagnozaResponse> toResponses(List<Dijagnoza> dijagnozaList){

        List<DijagnozaResponse> dijagnozaResponses = new ArrayList<>();
        for(Dijagnoza dijagnoza : dijagnozaList){
            dijagnozaResponses.add(toResponse(dijagnoza));
        }

        return dijagnozaResponses;
    }
}
