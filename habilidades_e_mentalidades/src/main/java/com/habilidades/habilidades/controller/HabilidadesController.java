package com.habilidades.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	@GetMapping
	public String habilidades() {
		return "As habilidades que utilizei foram Iniciativa, flexibilidade, compreensão e empatia e a mentalidade foi a de crescimento";
	}
	
}
