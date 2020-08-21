package com.ISA2020.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Table(name = "pacijent")
@Entity
public class Pacijent extends User {

	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private Long adresa;
	@Column
	private String drzava;
	@Column
	private String jedinstveniBrOsiguranika;
	//zdravstvenikarton
	
}
