package com.ISA2020.back.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Data
public class AdminKlinikeResponse {

    @NotBlank
    Long id;
    @NotBlank
    String ime;
    @NotBlank
    String prezime;
    @NotBlank
    String telefon;
    @NotBlank
    Long klinikaKojuOdrzava;//moze ici ppo idu
    //private boolean prvoLogovanje; //da limu jeovo prvo logovanje
    //da li treba u converteru da bude boolean

}
