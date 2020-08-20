package com.ISA2020.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "sala")
@Entity
public class Sala {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "naziv")
	private String naziv;
	@Column(name = "na_klinici")
	private Long naKlinici;
	@Column(name = "slobodna")
	private boolean slobodna;
}
