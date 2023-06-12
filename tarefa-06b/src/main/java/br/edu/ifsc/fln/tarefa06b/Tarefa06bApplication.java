package br.edu.ifsc.fln.tarefa06b;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Tarefa06bApplication {
	

	public static void main(String[] args) {

		MoedaDataSource.criarListaMoedas();
						
		SpringApplication.run(Tarefa06bApplication.class, args);
	}

}
