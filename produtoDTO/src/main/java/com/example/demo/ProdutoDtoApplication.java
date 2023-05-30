package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoDtoApplication {

	public static void main(String[] args) {
		
		ProdutoDataSource.criarLista();
		
		SpringApplication.run(ProdutoDtoApplication.class, args);
	}

}
