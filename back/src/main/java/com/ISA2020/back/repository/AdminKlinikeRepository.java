package com.ISA2020.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.AdminKlinike;

@Repository
public interface AdminKlinikeRepository extends JpaRepository<AdminKlinike, Long> {

	@Query(value = "SELECT * FROM admin_klinike AS ak where admin_centra=false", nativeQuery = true)
	List<AdminKlinike> findAdminiK(boolean b);
	@Query(value = "SELECT * FROM admin_klinike AS ak where admin_centra=true", nativeQuery = true)
	List<AdminKlinike> findAdminiKC(boolean b);
}
