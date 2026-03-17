package com.fag.lucasmartins.arquitetura_software.model.repository.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;
import com.fag.lucasmartins.arquitetura_software.model.repository.EventoRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.jpa.EventoJpaRepository;

@Repository
public class EventoRepositoryImpl implements EventoRepository {

    private final EventoJpaRepository eventoJpaRepository;

    public EventoRepositoryImpl(EventoJpaRepository eventoJpaRepository) {
        this.eventoJpaRepository = eventoJpaRepository;
    }

    @Override
    public EventoEntity save(EventoEntity entity) {
        return eventoJpaRepository.save(entity);
    }

    @Override
    public Optional<EventoEntity> findById(Long id) {
        return eventoJpaRepository.findById(id);
    }

    @Override
    public void delete(EventoEntity entity) {
        eventoJpaRepository.delete(entity);
    }
}
