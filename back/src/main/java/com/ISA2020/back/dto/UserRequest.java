package com.ISA2020.back.dto;

import lombok.Data;

//DTO koji preuzima podatke iz HTML forme za registraciju
@Data
public class UserRequest {
	private Long id;

	private String email;

	private String password;

	private String firstname;

	private String lastname;
	
	private int adress;
	
	private String country;
	
	private String jzbo;
}
