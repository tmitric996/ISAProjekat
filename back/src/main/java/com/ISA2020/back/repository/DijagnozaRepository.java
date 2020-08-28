package com.ISA2020.back.repository;

import com.ISA2020.back.model.Dijagnoza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DijagnozaRepository extends JpaRepository<Dijagnoza, Long> {

}
