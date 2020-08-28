package com.ISA2020.back.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AdminKlinikeRequest {

    @NotBlank
    String ime;
    @NotBlank
    String prezime;
    @NotBlank
    String telefon;
    @NotBlank
    Long klinikaKojuOdrzava;
    @NotBlank
    String email;
}
