package com.ISA2020.back.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ISA2020.back.enumerations.StatusGodinjegOdmora;

import lombok.Data;

@Table
@Data
public class GodisnjiOdmor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long zaRadnika;
	private StatusGodinjegOdmora statusGodisnjeg;
	private Date datumPocetka;
	private Date datumZavrsetka;

	
}
