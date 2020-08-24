package com.ISA2020.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.Pacijent;

@Repository
public interface PacijentRepository extends JpaRepository<Pacijent, Long>{

}
