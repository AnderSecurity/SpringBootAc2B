package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.ProfessorDTO;

import java.util.List;

public interface ICursoService {
    List<ProfessorDTO> findAllAllow(Long cursoId);
}
