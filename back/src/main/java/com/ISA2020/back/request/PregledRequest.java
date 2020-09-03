package com.ISA2020.back.request;

import com.ISA2020.back.enumerations.StanjePregleda;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class PregledRequest {

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
}
