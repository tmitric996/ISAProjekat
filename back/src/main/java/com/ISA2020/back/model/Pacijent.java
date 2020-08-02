package com.ISA2020.back.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Table
public class Pacijent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
    
	@JsonIgnore
	private String password;

	private String ime;
	private String prezime;
	private String adresa;
	private String drzava;
	private String jedinstveniBrOsiguranika;
	//zdravstvenikarton
	
}
