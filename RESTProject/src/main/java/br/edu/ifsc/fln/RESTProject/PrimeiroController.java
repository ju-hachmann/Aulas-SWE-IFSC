package br.edu.ifsc.fln.RESTProject;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PrimeiroController {

	
	@GetMapping("/mensagem")
	@ResponseBody
	public String mensagem () {
		String mensagem = "Olá, Mundo!";
		return mensagem;
	}
	
	
	@GetMapping("/nome")
	@ResponseBody
	public String nome (String nome) {
		String mensagem = "Olá, " + nome;
		return mensagem;
	}
	
	
	@GetMapping("/numero")
	@ResponseBody
	public int obterNumeroInteiro () {
		Random n = new Random();
		return n.nextInt();
	}
	
	
	@GetMapping("/data")
	@ResponseBody
	public String date () {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		return "Agora é " + now.format(pattern);
		
	}
	
	
	@GetMapping("/megasena")
	@ResponseBody
	public List<Integer> megasena () {
		Random r = new Random();
		List<Integer> numeros = new ArrayList<>();
		int numero;
		for (int i = 0; i < 6; i++) {
			do {
				numero = r.nextInt(10)+1;
			} while (numeros.contains(numero));
			numeros.add(numero);		
		}
		return numeros;
	}
	
	
	@GetMapping("/megasena2")
	@ResponseBody
	public List<Integer> megasenaDois () {
		
		Random r = new Random();
		List<Integer> listaNumeros = new ArrayList<>();
		
		while (listaNumeros.size() < 6)  {
			int numero = r.nextInt(60)+1;
			if (!listaNumeros.contains(numero)) {
				listaNumeros.add(numero);
			}
		}
		
		return listaNumeros;
	}
	
	// a outra solução seria usar 
	
	
 }
