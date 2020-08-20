package com.ISA2020.back.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "klinika")
@Entity
public class Klinika {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String naziv;
	@Column
	private String opis;
	@Column
	private Long adresa;
	//lista sala, zaposlenih, admini, slobodni termini, cenovnik
	@Column
	private Long pripadaKlinickomCentru;
	@Column
	private Long cenovnik;//idcenovnika
	@Column
	private int prosecnaOcena;
}
