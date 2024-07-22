package br.com.criaps.usuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usuarioController {

	@GetMapping("/usuario")
	public String usuario() {
		return "/usuario/usuario.html";

	}
}
