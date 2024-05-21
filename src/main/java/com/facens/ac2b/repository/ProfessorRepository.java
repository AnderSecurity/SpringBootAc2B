package com.facens.ac2b.repository;


import com.facens.ac2b.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query("Select p from Professor p left join fetch p.agenda where p.idProfessor = :id")
    Professor findWithAgendaById(@Param("id") Long id);

    Professor findByIdProfessorAndAgenda_IdAgenda(Long idProfessor, Long idAgenda);


}
