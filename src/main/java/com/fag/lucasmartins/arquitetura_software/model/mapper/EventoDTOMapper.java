package com.fag.lucasmartins.arquitetura_software.model.mapper;

import com.fag.lucasmartins.arquitetura_software.model.dto.EventoDTO;
import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;

public class EventoDTOMapper {

    private EventoDTOMapper() {
    }

    public static EventoEntity toEntity(EventoDTO dto) {
        EventoEntity entity = new EventoEntity();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setCapacidadeMaxima(dto.getCapacidadeMaxima());
        return entity;
    }

    public static EventoDTO toDto(EventoEntity entity) {
        return new EventoDTO(entity.getId(), entity.getNome(), entity.getCapacidadeMaxima());
    }
}