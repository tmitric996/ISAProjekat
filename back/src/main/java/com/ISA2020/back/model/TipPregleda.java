package com.ISA2020.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "tip_pregleda")
@Entity
public class TipPregleda {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String naziv;
	@Column
	private String opis;
	@Column
	private String cena;
	@Column
	private Long cenovnik;//id cenovnika na koji se kaci
	@Column
	private boolean imaZakazan;
}
