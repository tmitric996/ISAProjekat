package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.GodisnjiOdmor;

@Repository
public interface GodisnjiOdmorRepository extends JpaRepository<GodisnjiOdmor, Long>{
	
}
