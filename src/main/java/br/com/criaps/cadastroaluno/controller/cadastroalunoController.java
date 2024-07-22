package br.com.criaps.cadastroaluno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadastroalunoController {

	@GetMapping("/cadastroaluno")
	public String fornecedor() {
		return "/cadastroaluno/cadastroaluno.html";
}
}