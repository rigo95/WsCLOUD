package com.mvc.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.entidad.Juego;
import com.mvc.negocio.GestorJuego;

@Controller
public class ControladorJuego {

	@Autowired
	private GestorJuego gestorJuego;
	
	@GetMapping("consultarVideojuegoId")
	public String consultarJuegoId(@RequestParam("id_juego") int id, Model model) {
		Juego v = gestorJuego.buscarJuego(id);
		
		System.out.println("\n" + v);
		
		model.addAttribute("juego", v);
		
		return "busquedaid";
	}
	
	@GetMapping("regresar_listado")
	public String regresar(Model model) {
		List<Juego> listaJuegos = gestorJuego.obtenerLista();
		
		model.addAttribute("lista_Juegos", listaJuegos);
		
		return "inicio";
	}
}
