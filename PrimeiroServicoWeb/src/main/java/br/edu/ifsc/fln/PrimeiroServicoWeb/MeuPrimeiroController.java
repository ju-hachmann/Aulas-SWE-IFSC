package br.edu.ifsc.fln.PrimeiroServicoWeb;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MeuPrimeiroController {

	@GetMapping("/mensagem")
	@ResponseBody	
	public String mensagem() {
		return "Olá Juliana, Bem vinda ao primeiro Serviço Web =) ";
	}
	
	@GetMapping("/numero")
	@ResponseBody
	public int obterNumero() {
		Random r = new Random();
		return r.nextInt();
				
	}
	
}
