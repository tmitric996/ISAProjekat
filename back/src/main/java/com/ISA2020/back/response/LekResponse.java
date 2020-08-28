package com.ISA2020.back.response;

import com.ISA2020.back.model.MedicinskiRadnici;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class LekResponse {
    Long id;

    @NotBlank
    private String ime;
    @NotBlank
    private Integer sifra;
    @ManyToOne
    MedicinskiRadnici overenOdStrane;
    @NotBlank
    private Boolean overen;
}
