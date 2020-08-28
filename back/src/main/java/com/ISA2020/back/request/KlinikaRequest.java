package com.ISA2020.back.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class KlinikaRequest {

    @NotBlank
    String naziv;
    @NotBlank
    String opis;
    @NotBlank
    Long adresa;
    //lista sala, zaposlenih, admini, slobodni termini, cenovnik
    @NotBlank
    Long pripadaKlinickomCentru;
    @NotBlank
    Long cenovnik;//idcenovnika
    @NotBlank
    int prosecnaOcena;
}
