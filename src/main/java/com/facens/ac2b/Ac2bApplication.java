package com.facens.ac2b;

import com.facens.ac2b.DTO.Agenda.AgendaCadDTO;
import com.facens.ac2b.DTO.Curso.CursoCadDTO;
import com.facens.ac2b.DTO.Curso.VincularCursoDTO;
import com.facens.ac2b.DTO.Endereco.EnderecoDTO;
import com.facens.ac2b.DTO.Professor.ProfessorCadDTO;
import com.facens.ac2b.controller.AgendaController;
import com.facens.ac2b.controller.CursoController;
import com.facens.ac2b.controller.ProfessorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Ac2bApplication {

	@Bean
	public CommandLineRunner init(@Autowired ProfessorController professorController, @Autowired CursoController cursoController,
								  @Autowired AgendaController agendaController) {
		return (args) -> {

			EnderecoDTO end1 = new EnderecoDTO("Sorocaba", "SP", "31314");
			ProfessorCadDTO professor1 = new ProfessorCadDTO("Yago", "5435353", "313131", end1, "3131");
			Long profId = professorController.create(professor1);

			EnderecoDTO end2 = new EnderecoDTO("Votorantim", "SP", "432423");
			ProfessorCadDTO professor2 = new ProfessorCadDTO("Pedro", "123131", "31312", end2, "31314");
			Long profId2 = professorController.create(professor2);


			EnderecoDTO end3 = new EnderecoDTO("São Roque", "SP", "313131");
			ProfessorCadDTO professor3 = new ProfessorCadDTO("Joao", "121231233131", "31313212", end3, "13131");
			Long profId3 = professorController.create(professor3);

			EnderecoDTO end4 = new EnderecoDTO("São Paulo", "SP", "313131");
			ProfessorCadDTO professor4 = new ProfessorCadDTO("Maria", "121231233131", "31313212", end4, "13131");
			Long profId4 = professorController.create(professor4);

			EnderecoDTO end5 = new EnderecoDTO("Campinas", "SP", "313131");
			ProfessorCadDTO professor5 = new ProfessorCadDTO("Jose", "121231233131", "31313212", end5, "13131");
			Long profId5 = professorController.create(professor5);

			CursoCadDTO curso1 = new CursoCadDTO("ADS", "Curso de Analise e desenvolvimento de sistemas", 30F, "Aprendizados de novas tecnologis e funcionamento do mercado", "Aprender novas habilidades");
			Long curId = cursoController.create(curso1);

			CursoCadDTO curso2 = new CursoCadDTO("Engenharia da Computação", "Curso da Engenharia da Computação", 60F, "Aprendiazdos sobre aqruiteturas de computadores e softwares", "Aprendizado teorico e pratico");
			Long curId2 = cursoController.create(curso2);

			VincularCursoDTO vincula = new VincularCursoDTO(profId, curId);
			cursoController.vinculaProfessor(vincula);

			VincularCursoDTO vincula2 = new VincularCursoDTO(profId2, curId2);
			cursoController.vinculaProfessor(vincula2);

			VincularCursoDTO vincula3 = new VincularCursoDTO(profId3, curId);
			cursoController.vinculaProfessor(vincula3);

			VincularCursoDTO vincula4 = new VincularCursoDTO(profId4, curId);
			cursoController.vinculaProfessor(vincula4);

			VincularCursoDTO vincula5 = new VincularCursoDTO(profId5, curId2);
			cursoController.vinculaProfessor(vincula5);

			VincularCursoDTO vincula6 = new VincularCursoDTO(profId, curId2);
			cursoController.vinculaProfessor(vincula6);

			AgendaCadDTO agen1 = new AgendaCadDTO(curId2,LocalDate.of(2024, 7, 9),LocalDate.of(2024, 7, 20), profId);
			agendaController.create(agen1);

			AgendaCadDTO agen2 = new AgendaCadDTO(curId, LocalDate.of(2024, 6, 20), LocalDate.of(2024, 6, 24), profId);
			agendaController.create(agen2);

			AgendaCadDTO agen3 = new AgendaCadDTO(curId, LocalDate.of(2024, 7, 5), LocalDate.of(2024, 7, 10), profId4);
			agendaController.create(agen3);
		};}
	public static void main(String[] args) {
		SpringApplication.run(Ac2bApplication.class, args);
	}

}
