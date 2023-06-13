package com.ju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApi5Application {

	public static void main(String[] args) {
		ProdutoDataSource.criarLista();

		SpringApplication.run(ProdutoApi5Application.class, args);
	}

}
