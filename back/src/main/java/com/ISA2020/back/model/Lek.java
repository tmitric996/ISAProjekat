package com.ISA2020.back.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Lek {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String ime;

    @NotBlank
    private Integer sifra;

    @ManyToOne
    @JoinColumn(name = "med_rad_id")
    private MedicinskiRadnici overenOdStrane;

    private Boolean overen;
}
