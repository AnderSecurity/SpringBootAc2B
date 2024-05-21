package com.facens.ac2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ac2bApplication {

	@Bean
	public CommandLineRunner init(@Autowired ProdutosController produtosController, @Autowired CategoriaController categoriaController) {
		return (args) -> {}}
	public static void main(String[] args) {
		SpringApplication.run(Ac2bApplication.class, args);
	}

}
