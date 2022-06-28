package mx.com.is.ejercicio.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Controlador {
	
	String nombre = "Damian Gonzalez Flores";
	
	@RequestMapping("/home")
	public String getMainPage(Model model) {
		
		model.addAttribute("Nombre", nombre);
		model.addAttribute("tiempo", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		return "home";
	}

}
