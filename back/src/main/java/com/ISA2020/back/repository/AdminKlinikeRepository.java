package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.AdminKlinike;

@Repository
public interface AdminKlinikeRepository extends JpaRepository<AdminKlinike, Long> {

	@Query(value = "SELECT * FROM admin_klinike AS ak where tip_korisnika=ADMIN_KLINIKE", nativeQuery = true)
	List<AdminKlinike> findAdminiK();
	@Query(value = "SELECT * FROM admin_klinike AS ak where tip_korisnika=ADMIN_KCENTRA", nativeQuery = true)
	List<AdminKlinike> findAdminiKC();
}
