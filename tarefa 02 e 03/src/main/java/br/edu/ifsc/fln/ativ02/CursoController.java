package br.edu.ifsc.fln.ativ02;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
	
	private final AtomicInteger id = new AtomicInteger();

	@RequestMapping("/curso")
	public Curso curso(
			@RequestParam(value="nome", defaultValue="curso desconhecido") String curso, 
			@RequestParam(value="ch", defaultValue="0") int cargaHoraria)  {
		
		return new Curso (id.incrementAndGet(), curso, cargaHoraria);
		
	}
	
}
