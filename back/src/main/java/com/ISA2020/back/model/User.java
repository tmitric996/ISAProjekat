package com.ISA2020.back.model;

import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import com.ISA2020.back.enumerations.UsersEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Inheritance(strategy=TABLE_PER_CLASS)
@Data
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Long id;

	private String email;
	
	@JsonIgnore
	private String password;
	
	@Enumerated
	// TODO: 17/08/2020 sta ce nam ovo :)
	UsersEnum tipKorisnika;

}
