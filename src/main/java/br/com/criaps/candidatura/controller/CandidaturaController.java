package br.com.criaps.candidatura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CandidaturaController {

	@GetMapping("/candidatura")
	public String fornecedor() {
		return "/candidatura/candidatura.html";
}
}
