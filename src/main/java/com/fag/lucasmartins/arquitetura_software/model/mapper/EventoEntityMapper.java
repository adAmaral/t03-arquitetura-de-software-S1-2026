package com.fag.lucasmartins.arquitetura_software.model.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.EventoBO;
import com.fag.lucasmartins.arquitetura_software.model.entity.EventoEntity;

public class EventoEntityMapper {

    private EventoEntityMapper() {
    }

    public static EventoBO toBo(EventoEntity entity) {
        return new EventoBO(entity.getId(), entity.getNome(), entity.getCapacidadeMaxima());
    }

    public static EventoEntity toEntity(EventoBO bo) {
        EventoEntity entity = new EventoEntity();
        entity.setId(bo.getId());
        entity.setNome(bo.getNome());
        entity.setCapacidadeMaxima(bo.getCapacidadeMaxima());
        return entity;
    }
}
