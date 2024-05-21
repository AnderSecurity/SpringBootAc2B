package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.Curso.CursoAllowDTO;
import com.facens.ac2b.DTO.Curso.CursoCadDTO;
import com.facens.ac2b.DTO.Curso.VincularCursoDTO;
import org.springframework.stereotype.Service;

@Service
public interface ICursoService {
    CursoAllowDTO findAllAllow(Long cursoId);
    Long create(CursoCadDTO cursoCadDTO);

    void vinculaProfessor(VincularCursoDTO ids);
}
