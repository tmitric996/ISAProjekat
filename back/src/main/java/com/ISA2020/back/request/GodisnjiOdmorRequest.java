package com.ISA2020.back.request;

import com.ISA2020.back.enumerations.StatusGodinjegOdmora;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class GodisnjiOdmorRequest {

    @NotBlank
    Long zaRadnika;
    @NotBlank
    StatusGodinjegOdmora statusGodisnjeg;
    @NotBlank
    Date datumPocetka;
    @NotBlank
    Date datumZavrsetka;
}

