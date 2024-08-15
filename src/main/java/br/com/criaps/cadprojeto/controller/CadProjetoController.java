package br.com.criaps.cadprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadProjetoController {

	@GetMapping("/cadprojeto")
	public String fornecedor() {
		return "/cadprojeto/cadprojeto.html";
}
}
