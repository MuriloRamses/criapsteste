package br.com.criaps.listarprojetos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListarProjetosController {

	@GetMapping("/listarprojetos")
	public String fornecedor() {
		return "/listarprojetos/listarprojetos.html";
}
}
