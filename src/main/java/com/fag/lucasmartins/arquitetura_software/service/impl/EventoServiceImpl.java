package com.fag.lucasmartins.arquitetura_software.service.impl;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.dto.EventoDTO;
import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;
import com.fag.lucasmartins.arquitetura_software.model.mapper.EventoDTOMapper;
import com.fag.lucasmartins.arquitetura_software.model.repository.EventoRepository;
import com.fag.lucasmartins.arquitetura_software.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {

    private final EventoRepository eventoRepository;

    public EventoServiceImpl(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public EventoDTO criarEvento(EventoDTO dto) {
        EventoEntity entity = EventoDTOMapper.toEntity(dto);
        entity.setIngressosVendidos(0);

        EventoEntity saved = eventoRepository.save(entity);

        return EventoDTOMapper.toDto(saved);
    }

    @Override
    public void comprarIngresso(Long id) {
        EventoEntity entity = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

        if (entity.getIngressosVendidos() >= entity.getCapacidadeMaxima()) {
            throw new RuntimeException("O evento já se encontra esgotado!");
        }

        entity.setIngressosVendidos(entity.getIngressosVendidos() + 1);
        eventoRepository.save(entity);
    }
}
