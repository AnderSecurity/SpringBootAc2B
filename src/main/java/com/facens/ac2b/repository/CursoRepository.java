package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Curso;
import com.facens.ac2b.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Professor> findByCurso_IdCurso(Long idCurso);
}
