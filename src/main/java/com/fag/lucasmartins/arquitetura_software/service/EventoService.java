package com.fag.lucasmartins.arquitetura_software.service;

import com.fag.lucasmartins.arquitetura_software.model.dto.EventoDTO;

public interface EventoService {

    EventoDTO criarEvento(EventoDTO dto);

    void comprarIngresso(Long id);
}