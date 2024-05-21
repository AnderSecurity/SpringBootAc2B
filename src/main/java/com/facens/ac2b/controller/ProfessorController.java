package com.facens.ac2b.controller;


import com.facens.ac2b.DTO.Professor.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.Professor.ProfessorAgendaUniDTO;
import com.facens.ac2b.DTO.Professor.ProfessorCadDTO;
import com.facens.ac2b.service.model.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private IProfessorService professorService;

    @GetMapping("/agendas/{id}")
    public ProfessorAgendaDTO get(@PathVariable Long id) {
        return professorService.findById(id);
    }

    @PostMapping("/create")
    public Long create(@RequestBody ProfessorCadDTO dto) {
       return professorService.save(dto);
    }

    @GetMapping("/agendas/{profId}/{agendaId}")
    public ProfessorAgendaUniDTO getAgenda(@PathVariable Long profId, @PathVariable Long agendaId) {
        return professorService.findAgendaById(profId, agendaId);
    }
}
