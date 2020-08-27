package com.ISA2020.back.response;

import com.ISA2020.back.enumerations.StatusGodinjegOdmora;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Builder
//builder procitaj sta radi :)
@AllArgsConstructor
public class GodisnjiOdmorResponse {

    @Id
    Long id;
    @NotBlank
    Long zaRadnika;
    @NotBlank
    StatusGodinjegOdmora statusGodisnjeg;
    @NotBlank
    Date datumPocetka;
    @NotBlank
    Date datumZavrsetka;
}
