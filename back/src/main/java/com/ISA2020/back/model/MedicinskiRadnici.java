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
@Table(name = "med_radnik")
@Entity
public class MedicinskiRadnici {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String email;
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private String telefon;
	@Column
	private Long klinikaUKojojSuZaposleni;//moze ici ppo idu
	@Column
	private boolean lekar;
	@Column
	@JsonIgnore
	private String password;
	@Column
	private boolean prvoLogovanje;

}
