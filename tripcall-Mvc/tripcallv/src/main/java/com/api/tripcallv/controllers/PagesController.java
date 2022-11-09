package com.api.tripcallv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
	
	
	@GetMapping("home/promocao")
	protected String promocao() {
		return "promocao.html";
	}
	
	@GetMapping("home/destino")
	protected String destino () {
		return "destino.html";
	}
	
	@GetMapping("/home")
	protected String index () {
		return "index.html";
	}

	@GetMapping("home/contato")
	protected String contato () {
		return "contato.html";
	}
	
	@GetMapping("home/login")
	protected String login () {
		return "login.html";
	}
	
	}
	
		 
	 

