package com.ISA2020.back.converter;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.response.AdminKlinikeResponse;
import com.ISA2020.back.response.GodisnjiOdmorResponse;

import java.util.ArrayList;
import java.util.List;

public class AdminKlinikeKonverter {

    public static AdminKlinikeResponse toResponse(AdminKlinike adminKlinike){
        return new AdminKlinikeResponse(adminKlinike.getId(), adminKlinike.getIme(), adminKlinike.getPrezime(), adminKlinike.getTelefon(), adminKlinike.getKlinikaKojuOdrzava());
    }

    public static List<AdminKlinikeResponse> toResponses (List<AdminKlinike> adminKlinikeList){

        List<AdminKlinikeResponse> adminKlinikeResponsesList = new ArrayList<>();
        for (AdminKlinike adminKlinike : adminKlinikeList) {
            adminKlinikeResponsesList.add(toResponse(adminKlinike));
        }

        return adminKlinikeResponsesList;
    }
}
