package swe.trabalho_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrabalhoFinalApplication {

	public static void main(String[] args) {
		LivroDataSource.criarLista();
		SpringApplication.run(TrabalhoFinalApplication.class, args);
	}

}
