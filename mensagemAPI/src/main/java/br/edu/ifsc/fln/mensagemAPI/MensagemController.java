package br.edu.ifsc.fln.mensagemAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MensagemController {
	
	private final AtomicLong contador = new AtomicLong();
	// AtomicLong é um tipo de dado looongo que se usa em caso de 'concorrência'
	
	private static final String template = "Olá, %s!";
	
	
	@RequestMapping("/mensagem")
	public Mensagem mensagem (@RequestParam(value="nome", defaultValue="mundo") String nome) { // show: tá fazendo o REST trazer a variável "nome" e fazer o java atribuir ela a nome
		return new Mensagem(contador.incrementAndGet(), 
							String.format(template, nome));
	}

	
}
