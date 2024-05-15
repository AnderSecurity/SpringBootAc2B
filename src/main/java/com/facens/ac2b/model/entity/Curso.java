package com.facens.ac2b.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity// define que é uma entidade do banco de dados
@Getter// monta todos os getters da entidade
@Setter// monta todos os setters da entidade
@NoArgsConstructor // define que a classe possui um construtor vazio ex: new entity();
@AllArgsConstructor// define que a classe possui um construtor com todos os atributos da entidade new entity(Long entityId, ...)
@Builder// define que a classe permite ustilizar o metodo builder para criar uma instancia da classe;
public class Curso {

    @Id// define a variavel é uma chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)// define que o id é gerado automaticamente
    @Column(name = "id")// define o nome da coluna
    private Long idCurso;
    private String name;
    private String description;
    private float workLoad;
    private String objectives;
    private String menu;

    @OneToMany
    @JoinColumn(name = "agenda_id")
    List agendList = new ArrayList<Agenda>();

    @ManyToMany
    @JoinColumn(name = "professor_id")
    List professorList = new ArrayList<Professor>();
}
