package com.ISA2020.back.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

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
	private boolean prvoLogovanje; //da limu jeovo prvo logovanje
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if (this.getTipKorisnika().equals("ADMIN_KLINIKE")) {
			Authority auth= new Authority();
			auth.setName("ROLA_ADMIN_KLINIKE");
			return (Collection<? extends GrantedAuthority>) auth;
		}
		else {
			Authority auth= new Authority();
			auth.setName("ROLA_ADMIN_KCENTRA");
			return (Collection<? extends GrantedAuthority>) auth;
		}
	}
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

	
}
