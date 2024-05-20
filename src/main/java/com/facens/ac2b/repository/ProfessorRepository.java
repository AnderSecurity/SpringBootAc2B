package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Agenda;
import com.facens.ac2b.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Professor findByProfessor_IdProfessor(Long idProfessor);

    Agenda findByIdAgendaAndProfessor_IdProfessor(Long idAgenda, Long idProfessor);
}
