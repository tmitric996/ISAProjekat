package com.ISA2020.back.response;

import com.ISA2020.back.model.Pacijent;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
public class OperacijaResponse {

    @NotBlank
    Long id;
    @NotBlank
    ZonedDateTime datumVreme;
    @NotBlank
    String imePacijenta;
    @NotBlank
    String prezimePacijenta;
}
