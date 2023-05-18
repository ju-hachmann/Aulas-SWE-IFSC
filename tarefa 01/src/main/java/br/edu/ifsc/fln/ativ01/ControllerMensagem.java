package br.edu.ifsc.fln.ativ01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerMensagem {

	public final String mensagem = "Olá! "
			+ "Agora são %1$sh "
			+ "do dia %2$s "
			+ "e você acessou minha primeira atividade de Serviços Web. Obrigada!";
	
	@GetMapping("/mensagem")
	@ResponseBody
	public String mensagem() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dia = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
		
		return String.format(mensagem, now.format(hora), now.format(dia));
	}
	
}
