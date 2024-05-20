package com.facens.ac2b.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idagenda")
    private Long idAgenda;

    @OneToOne
    @JoinColumn(name = "professorid")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "cursoid")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "enderecoid")
    private Endereco endereco;

    private LocalDate dataInit;

    private LocalDate dataFim;

    private LocalTime horaInit;

    private LocalTime horaFim;

    private int qtdAlunos;

    private String ocorrencia;

}
