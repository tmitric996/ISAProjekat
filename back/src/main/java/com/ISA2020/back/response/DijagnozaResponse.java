package com.ISA2020.back.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@AllArgsConstructor
@Data
public class DijagnozaResponse {

    @Id
    Long id;
    @NotBlank
    String ime;
    @NotBlank
    Integer sifra;
}
