package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.ProfessorCadDTO;
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
    public void create(@RequestBody ProfessorCadDTO dto) {
        professorService.save(dto);
    }
}
