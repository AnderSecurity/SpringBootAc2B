package com.facens.ac2b;

import com.facens.ac2b.DTO.CursoCadDTO;
import com.facens.ac2b.DTO.EnderecoDTO;
import com.facens.ac2b.DTO.ProfessorCadDTO;
import com.facens.ac2b.controller.AgendaController;
import com.facens.ac2b.controller.CursoController;
import com.facens.ac2b.controller.ProfessorController;
import com.facens.ac2b.model.entity.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ac2bApplication {

	@Bean
	public CommandLineRunner init(@Autowired ProfessorController professorController, @Autowired CursoController cursoController,
								  @Autowired AgendaController agendaController) {
		return (args) -> {
			EnderecoDTO end1 = new EnderecoDTO("Sorocaba", "SP", "31314");
			ProfessorCadDTO professor1 = new ProfessorCadDTO("Yago", "5435353", "313131", end1, "3131");
			professorController.create(professor1);

			EnderecoDTO end2 = new EnderecoDTO("Votorantim", "SP", "432423");
			ProfessorCadDTO professor2 = new ProfessorCadDTO("Pedro", "123131", "31312", end2, "31314");
			professorController.create(professor2);


			EnderecoDTO end3 = new EnderecoDTO("São Roque", "SP", "313131");
			ProfessorCadDTO professor3 = new ProfessorCadDTO("Joao", "121231233131", "31313212", end3, "13131");
			professorController.create(professor3);

			EnderecoDTO end4 = new EnderecoDTO("São Paulo", "SP", "313131");
			ProfessorCadDTO professor4 = new ProfessorCadDTO("Maria", "121231233131", "31313212", end4, "13131");
			professorController.create(professor4);

			EnderecoDTO end5 = new EnderecoDTO("Campinas", "SP", "313131");
			ProfessorCadDTO professor5 = new ProfessorCadDTO("Jose", "121231233131", "31313212", end5, "13131");
			professorController.create(professor5);

			CursoCadDTO curso1 = new CursoCadDTO("ADS", "Curso de Analise e desenvolvimento de sistemas", 30F, "Aprendizados de novas tecnologis e funcionamento do mercado", "Aprender novas habilidades");
			cursoController.create(curso1);

			CursoCadDTO curso2 = new CursoCadDTO("Engenharia da Computação", "Curso da Engenharia da Computação", 60F, "Aprendiazdos sobre aqruiteturas de computadores e softwares", "Aprendizado teorico e pratico");
			cursoController.create(curso2);


		};}
	public static void main(String[] args) {
		SpringApplication.run(Ac2bApplication.class, args);
	}

}
