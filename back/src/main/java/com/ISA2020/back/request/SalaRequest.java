package com.ISA2020.back.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SalaRequest {

    @NotBlank
    String naziv;
    @NotBlank
    Long naKlinici;
    @NotBlank
    Boolean slobodna;
}
