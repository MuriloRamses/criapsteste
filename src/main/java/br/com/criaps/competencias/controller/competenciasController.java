package br.com.criaps.competencias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class competenciasController {

	@GetMapping("/competencias")
	public String fornecedor() {
		return "/competencias/competencias.html";
}
}
