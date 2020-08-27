package com.ISA2020.back.converter;

import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.response.GodisnjiOdmorResponse;

import java.util.ArrayList;
import java.util.List;

public class GodisnjiOdmorConverter {

    public static GodisnjiOdmorResponse toResponse(GodisnjiOdmor godisnjiOdmor){
        return new GodisnjiOdmorResponse(godisnjiOdmor.getId(), godisnjiOdmor.getZaRadnika(), godisnjiOdmor.getStatusGodisnjeg(), godisnjiOdmor.getDatumPocetka(), godisnjiOdmor.getDatumZavrsetka());
    }

    public static List<GodisnjiOdmorResponse> toResponses (List<GodisnjiOdmor> godisnjiOdmorList){

        List<GodisnjiOdmorResponse> godisnjiOdmorResponses = new ArrayList<>();
        for (GodisnjiOdmor godisnjiOdmor : godisnjiOdmorList) {
            godisnjiOdmorResponses.add(toResponse(godisnjiOdmor));
        }

        return godisnjiOdmorResponses;
    }
}
