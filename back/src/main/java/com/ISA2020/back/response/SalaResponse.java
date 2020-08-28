package com.ISA2020.back.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class SalaResponse {

    @Id
    Long id;
    @NotBlank
    String naziv;
    @NotBlank
    Long naKlinici;
    @NotBlank
    Boolean slobodna;
}
