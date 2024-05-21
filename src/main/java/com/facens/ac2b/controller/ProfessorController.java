package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.ProfessorAgendaDTO;
import com.facens.ac2b.service.model.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private IProfessorService professorService;

    @GetMapping("/agendas/{id}")
    public ProfessorAgendaDTO get(@PathVariable Long id) {
        return professorService.findById(id);
    }
}
