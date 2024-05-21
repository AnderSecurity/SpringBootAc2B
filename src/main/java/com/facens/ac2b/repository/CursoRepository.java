package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("Select c from Curso c left join fetch c.professorList where c.idCurso = :id")
    Curso findAllowProf(@Param("id") Long id);
}
