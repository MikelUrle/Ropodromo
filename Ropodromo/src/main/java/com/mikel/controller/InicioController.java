package com.mikel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mikel.repository.RopaRepository;


@Controller
public class InicioController {
	
	@Autowired
	private RopaRepository ropaRepo;
	
	@RequestMapping("/")
	public String paginaPrincipal(Model model) {
		
		model.addAttribute("atr_lista_ropa", ropaRepo.findAll());
		
		return "index";
	}
	
}
