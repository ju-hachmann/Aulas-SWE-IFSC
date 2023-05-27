package br.edu.ifsc.fln.ativ05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ativ05Application {

	public static void main(String[] args) {
		FuncionarioDataSource.criarLista();
		SpringApplication.run(Ativ05Application.class, args);
	}

}
