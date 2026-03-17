package com.fag.lucasmartins.arquitetura_software.model.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;

@Repository
public interface EventoJpaRepository extends JpaRepository<EventoEntity, Long> {
}
