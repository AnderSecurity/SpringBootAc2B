package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.ProfessorDTO;
import com.facens.ac2b.repository.CursoRepository;
import com.facens.ac2b.service.model.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<ProfessorDTO> findAllAllow(Long cursoId) {
        return cursoRepository.findByCurso_IdCurso(cursoId).stream().map(ProfessorDTO::new).toList();
    }
}
