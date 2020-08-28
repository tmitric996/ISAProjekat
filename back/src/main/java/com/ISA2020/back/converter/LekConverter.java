package com.ISA2020.back.converter;

import com.ISA2020.back.model.Lek;
import com.ISA2020.back.response.LekResponse;

import java.util.ArrayList;
import java.util.List;

public class LekConverter {

    public static LekResponse toResponse(Lek lek){
        return new LekResponse(lek.getId(), lek.getIme(), lek.getSifra(), lek.getOverenOdStrane(), lek.getOveren());
    }

    public static List<LekResponse> toResponses(List<Lek> lekList){
        List<LekResponse> lekResponses = new ArrayList<>();
        for(Lek lek : lekList){
            lekResponses.add(toResponse(lek));
        }

        return lekResponses;
    }
}
