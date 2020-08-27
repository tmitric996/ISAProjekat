package com.ISA2020.back.converter;

import com.ISA2020.back.model.Sala;
import com.ISA2020.back.request.SalaRequest;
import com.ISA2020.back.response.SalaResponse;

import java.util.ArrayList;
import java.util.List;

public class SalaConverter {

    public static SalaResponse toResponse(Sala sala){
        SalaResponse salaResponse = new SalaResponse(sala.getId(), sala.getNaziv(), sala.getNaKlinici(), sala.getSlobodna());
        return salaResponse;
    }

    public static List<SalaResponse> toResponses(List<Sala> salaList){
        List<SalaResponse> salaResponses = new ArrayList<>();
        for(Sala sala : salaList){
            salaResponses.add(toResponse(sala));
        }

        return salaResponses;
    }
}
