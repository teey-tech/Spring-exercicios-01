package com.objetivo.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	
	@GetMapping
	public String objetivo() {
		return "O meu objetivo pra essa semana é de aprender a utilizar o spring";
	}
}

