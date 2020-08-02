package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.MedicinskiRadnici;

@Repository
public interface MedicinskiRadniciRepository extends JpaRepository<MedicinskiRadnici, Long> {

	@Query(value = "SELECT * FROM med_radnik AS mr where lekar=true", nativeQuery = true)
	List<MedicinskiRadnici> findLekari(boolean b);
	@Query(value = "SELECT * FROM med_radnik AS mr where lekar=false", nativeQuery = true)
	List<MedicinskiRadnici> findTehnicari(boolean b);
}
