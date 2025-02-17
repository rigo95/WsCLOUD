package com.mvc.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.entidad.Juego;
import com.mvc.entidad.Usuario;
import com.mvc.negocio.GestorJuego;
import com.mvc.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gestorUsuario;
	
	@Autowired
	private GestorJuego gestorJuego;
	
	
	@PostMapping("doLogin")
	public String logarse(
			@RequestParam("THE_BOSS") String nombre,
			@RequestParam("Sacarun5mevalejeje") String password,
			Model model) {
		
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setPassword(password);
		
		boolean validado = gestorUsuario.validarUsuario(user);
		
		if (validado) {
			model.addAttribute("THE_BOSS");
			
			List<Juego> listaJuegos = gestorJuego.obtenerLista();
			
			model.addAttribute("lista_juegos", listaJuegos);
			
			return "beginning";
		} else {
			return "error";
		}
	}

}
