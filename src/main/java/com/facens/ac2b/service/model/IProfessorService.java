package com.facens.ac2b.service.model;


import com.facens.ac2b.DTO.Professor.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.Professor.ProfessorAgendaUniDTO;
import com.facens.ac2b.DTO.Professor.ProfessorCadDTO;
import org.springframework.stereotype.Service;


@Service
public interface IProfessorService {
    Long save(ProfessorCadDTO cadProf);
    ProfessorAgendaDTO findById(Long profId);
    ProfessorAgendaUniDTO findAgendaById(Long profId, Long agendaId);
}
