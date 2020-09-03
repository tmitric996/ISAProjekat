package com.ISA2020.back.request;

import com.ISA2020.back.model.Pacijent;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeWithZoneIdSerializer;
import lombok.Data;
import lombok.Setter;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Setter
public class OperacijaRequest {

    @NotBlank
    ZonedDateTime datumVreme;
    @NotBlank
    Long pacijentId;
}
