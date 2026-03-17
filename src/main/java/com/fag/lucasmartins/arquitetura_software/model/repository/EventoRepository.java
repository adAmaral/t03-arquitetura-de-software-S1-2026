package com.fag.lucasmartins.arquitetura_software.model.repository;

import java.util.Optional;

import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;

public interface EventoRepository {

    EventoEntity save(EventoEntity entity);

    Optional<EventoEntity> findById(Long id);

    void delete(EventoEntity entity);
}