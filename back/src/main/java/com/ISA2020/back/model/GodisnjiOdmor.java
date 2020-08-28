package com.ISA2020.back.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ISA2020.back.enumerations.StatusGodinjegOdmora;

import lombok.Data;
import lombok.Getter;

@Table(name = "god_odmor")
@Entity
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
