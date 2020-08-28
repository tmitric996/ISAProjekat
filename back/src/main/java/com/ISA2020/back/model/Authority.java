package com.ISA2020.back.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
@Table(name="AUTHORITY")
@Entity
@Data
public class Authority implements GrantedAuthority {
	
	@Id
	private Long id;
	private String name;
	@Override
	public String getAuthority() {
		return name;
	}
	
}
