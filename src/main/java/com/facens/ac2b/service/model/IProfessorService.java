package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.AgendaDTO;
import com.facens.ac2b.DTO.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.ProfessorCadDTO;



public interface IProfessorService {
    void save(ProfessorCadDTO cadProf);
    ProfessorAgendaDTO findById(Long profId);
    AgendaDTO findAgendaById(Long profId, Long agendaId);
}
