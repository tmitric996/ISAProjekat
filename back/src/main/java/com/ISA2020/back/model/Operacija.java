package com.ISA2020.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;


@Entity
public class Operacija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date datumVreme;

    //private Pacijent pacijent;
    //todo: naci kako se stavlja lista kao parametar
    //za listu medicinskih radnika


}
