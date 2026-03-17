package com.fag.lucasmartins.arquitetura_software.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fag.lucasmartins.arquitetura_software.model.dto.EventoDTO;
import com.fag.lucasmartins.arquitetura_software.service.EventoService;


@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping
    public ResponseEntity<EventoDTO> criarEvento(@Valid @RequestBody EventoDTO dto) {
        EventoDTO eventoCriadoDTO = eventoService.criarEvento(dto);

        return ResponseEntity
                .status(201)
                .body(eventoCriadoDTO);
    }

    @PostMapping("/{id}/comprar")
    public ResponseEntity<String> comprarIngresso(@PathVariable Long id) {
        eventoService.comprarIngresso(id);

        return ResponseEntity.ok("Ingresso adquirido com sucesso!");
    }
}