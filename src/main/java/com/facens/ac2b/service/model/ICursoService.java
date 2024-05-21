package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.CursoCadDTO;
import com.facens.ac2b.DTO.ProfessorDTO;
import com.facens.ac2b.DTO.VincularCursoDTO;

import java.util.List;

public interface ICursoService {
    List<ProfessorDTO> findAllAllow(Long cursoId);
    void create(CursoCadDTO cursoCadDTO);

    void vinculaProfessor(VincularCursoDTO ids);
}
