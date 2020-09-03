package com.ISA2020.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.Pregled;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface PregledRepository extends JpaRepository<Pregled, Long>{
    public List<Pregled> findAllByDoktorKojiVrsiAndDatumVremeAfterAndKrajPregledaBefore(Long id, ZonedDateTime jucerasnjiDatum, ZonedDateTime sutrasnjiDatum);
}
