package br.com.criaps.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.criaps.index.controller",
		"br.com.criaps.cadastroaluno.controller",
		"br.com.criaps.competencias.controller",
		"br.com.criaps.login.controller",
		"br.com.criaps.usuario.controller"

})
public class CriapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriapsApplication.class, args);
	}

}
