package com.ISA2020.back.dto;

import lombok.Data;

//DTO koji preuzima podatke iz HTML forme za registraciju
@Data
public class UserRequest {
	private Long id;

	private String email;

	private String password;

	private String ime;

	private String prezime;
	
	private int adresa;
	
	private String drzava;
	
	private String jedinstveniBrOsiguranika;
}
