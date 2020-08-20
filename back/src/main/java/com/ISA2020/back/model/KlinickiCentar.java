package com.ISA2020.back.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Table
public class KlinickiCentar {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String naziv;
	private Long adresa; //Adresa.tostring
	private String telefon;
	//lista klinika, admini, pacijenti


}


