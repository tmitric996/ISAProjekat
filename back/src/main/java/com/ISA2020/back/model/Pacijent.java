package com.ISA2020.back.model;

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


	private String ime;
	private String prezime;
	private String adresa;
	private String drzava;
	private String jedinstveniBrOsiguranika;
	//zdravstvenikarton
	
}
