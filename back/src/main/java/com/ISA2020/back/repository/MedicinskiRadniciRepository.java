package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.MedicinskiRadnici;

@Repository
public interface MedicinskiRadniciRepository extends JpaRepository<MedicinskiRadnici, Long> {

	@Query(value = "SELECT * FROM med_radnik AS mr where tip_korisnika=LEKAR", nativeQuery = true)
	List<MedicinskiRadnici> findLekari();
	@Query(value = "SELECT * FROM med_radnik AS mr where tip_korisnika=MED_TEHNICAR", nativeQuery = true)
	List<MedicinskiRadnici> findTehnicari();
}
