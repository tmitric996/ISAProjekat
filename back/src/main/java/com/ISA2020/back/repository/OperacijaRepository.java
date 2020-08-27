package com.ISA2020.back.repository;

import com.ISA2020.back.model.Operacija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OperacijaRepository extends JpaRepository<Operacija, Long> {
    Optional<Operacija> findById(Long id);
}
