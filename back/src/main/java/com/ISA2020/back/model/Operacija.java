package com.ISA2020.back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Operacija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ZonedDateTime datumVreme;

    @ManyToOne
    @JoinColumn(name = "pacijentId")
    private Pacijent pacijent;
    //za listu medicinskih radnika

    @ManyToOne
    private Sala salaUKojojSeVrsi;

}
