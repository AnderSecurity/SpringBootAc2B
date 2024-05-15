package com.facens.ac2b.repository;

import com.facens.ac2b.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// define que a classe é um repositorio
// JpaRepository<T, ID> - T = entidade, ID = tipo da chave primaria
public interface ModelRepository extends JpaRepository<Professor, Long> {

}
