package com.ISA2020.back.request;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Data
@Getter
public class DijagnozaRequest {

    @NotBlank
    String ime;
    @NotBlank
    Integer sifra;
}
