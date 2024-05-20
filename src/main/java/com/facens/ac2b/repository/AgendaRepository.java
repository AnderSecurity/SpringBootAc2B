package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Agenda;
import com.facens.ac2b.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository// define que a classe é um repositorio
// JpaRepository<T, ID> - T = entidade, ID = tipo da chave primaria
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    boolean existsByProfessor_IdProfessorAndDataInitGreaterThanEqualAndDataFimLessThanEqual(Long idProfessor, LocalDate dataInit, LocalDate dataFim);

}
