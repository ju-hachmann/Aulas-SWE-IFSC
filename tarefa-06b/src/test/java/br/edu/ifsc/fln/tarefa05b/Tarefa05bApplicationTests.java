package br.edu.ifsc.fln.tarefa05b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ifsc.fln.tarefa06b.Moeda;

@SpringBootTest
class Tarefa05bApplicationTests {

	@Test
	void getTipoMoeda() {
		Moeda moeda = new Moeda("dc", 5.6061, 5.6069);
		String tipo = "dc";
		assertEquals(tipo, moeda.getTipo());
	}

}
