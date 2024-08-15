package br.com.criaps.acompanhar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcompanharController {

	@GetMapping("/telaacompanhar")
	public String fornecedor() {
		return "/acompanhamento/telaacompanhar.html";
}
}
