package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    @Query("Select case when count(a) > 0 then true else false end from Agenda a where a.professor.idProfessor = :idProfessor and a.dataInit <= :data and a.dataFim >= :data")
    boolean existsByProfessor_IdProfessorAndDataInitGreaterThanEqualAndDataFimLessThanEqual(@Param("idProfessor") Long idProfessor, @Param("data") LocalDate data);
}
