package com.facens.ac2b.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity// define que é uma entidade do banco de dados
@Getter// monta todos os getters da entidade
@Setter// monta todos os setters da entidade
@NoArgsConstructor // define que a classe possui um construtor vazio ex: new entity();
@AllArgsConstructor// define que a classe possui um construtor com todos os atributos da entidade new entity(Long entityId, ...)
@Builder// define que a classe permite ustilizar o metodo builder para criar uma instancia da classe;
public class Agenda {

    @Id// define a variavel é uma chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)// define que o id é gerado automaticamente
    @Column(name = "id")// define o nome da coluna
    private Long idAgenda;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    private Curso curso;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    private LocalDate dataInit;
    private LocalDate dataFim;
    private LocalTime horaInit;
    private LocalTime horaFim;
    private int qtdAlunos;

}
