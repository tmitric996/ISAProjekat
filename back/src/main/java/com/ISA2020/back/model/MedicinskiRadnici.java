package com.ISA2020.back.model;

import java.awt.List;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Table(name = "med_radnik")
@Entity
public class MedicinskiRadnici extends User {

	
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private String telefon;
	@Column
	private Long klinikaUKojojSuZaposleni;//moze ici ppo idu
	@Column
	
	private Boolean prvoLogovanje; //da limu jeovo prvo logovanje
	
	@Override
	public String getUsername() {
		return this.getEmail();
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}


}
