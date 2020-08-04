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
@Table(name = "admin_klinike")
@Entity
public class AdminKlinike extends User{

	
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private String telefon;
	@Column
	private Long klinikaKojuOdrzava;//moze ici ppo idu
	@Column
	private boolean adminCentra;// da li jeadmin kc ili samo klinike
	@Column
	private boolean prvoLogovanje; //da limu jeovo prvo logovanje

	
}
