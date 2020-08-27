package com.ISA2020.back.request;

import com.ISA2020.back.model.MedicinskiRadnici;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Data
public class LekRequest {

    @NotBlank
    String ime;
    @NotBlank
    Integer sifra;
}
