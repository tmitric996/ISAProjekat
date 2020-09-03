package com.ISA2020.back.response;

import com.ISA2020.back.enumerations.StanjePregleda;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class PregledResponse {

    @Id
    Long id;
    @NotBlank
    ZonedDateTime datumVreme;
    @NotBlank
    ZonedDateTime krajPregleda;
    @NotBlank
    Long tipPRegleda;
    @NotBlank
    Long doktorKojiVrsi;
    @NotBlank
    Long brojSale;
    @NotBlank
    Long pacijent;
    @NotBlank
    StanjePregleda statusPregleda;
    @NotBlank
    String izvestaj;

    public PregledResponse() {

    }
}


