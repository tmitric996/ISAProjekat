package com.ISA2020.back.converter;

import com.ISA2020.back.model.Operacija;
import com.ISA2020.back.response.OperacijaResponse;

import java.util.ArrayList;
import java.util.List;

public class OperacijaConverter {

    public static OperacijaResponse toResponse(Operacija operacija){
        return new OperacijaResponse(operacija.getId(), operacija.getDatumVreme(), operacija.getPacijent().getIme(), operacija.getPacijent().getPrezime());
    }

    public static List<OperacijaResponse> toResponses(List<Operacija> operacijaList){
        List<OperacijaResponse> operacijaResponses = new ArrayList<>();
        for(Operacija operacija : operacijaList){
            operacijaResponses.add(toResponse(operacija));
        }
        return  operacijaResponses;
    }
    
}
