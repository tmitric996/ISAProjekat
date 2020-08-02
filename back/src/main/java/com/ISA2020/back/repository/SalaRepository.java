package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
	@Query(value = "SELECT * FROM sala AS s", nativeQuery = true)
	List<Sala> findAll();
	@Query(value = "SELECT * FROM sala AS s where slobodna=true", nativeQuery = true)
	List<Sala> findSlobodna(boolean b);
}
