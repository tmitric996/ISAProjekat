package com.ISA2020.back.request;

import com.ISA2020.back.model.Pacijent;
import lombok.Data;
import lombok.Setter;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Setter
public class OperacijaRequest {

    @NotBlank
    Date datumVreme;
    @NotBlank
    Long pacijentId;
}
