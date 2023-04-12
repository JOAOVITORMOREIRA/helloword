package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello!<br />João Vitor Moreira!</b>";
	}
	
	@GetMapping("/bsm")
	public String bsmLista() {
		return "<b>Responsabilidade Pessoal;<br />Mentalidade de Crescimento;</b><br />Oreintação ao Futuro;</b><br />Persistência</b>";
	}
	
	@GetMapping("/objetivo")
	public String meusObjetivos() {
		return "<b>Orientacao aos detalhes<br />Trabalho em Equipe</b>";
	}
}
