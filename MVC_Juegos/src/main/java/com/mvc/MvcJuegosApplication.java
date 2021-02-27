package com.mvc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mvc.entidad.Juego;
import com.mvc.entidad.Usuario;
import com.mvc.persistencia.DaoJuego;
import com.mvc.persistencia.DaoUsuario;

@SpringBootApplication
public class MvcJuegosApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MvcJuegosApplication.class, args);
		
		DaoJuego daoJuego = context.getBean("daoJuego", DaoJuego.class);
		
		DaoUsuario daoUsuario = context.getBean("daoUsuario", DaoUsuario.class);
		
		Juego j1 = new Juego();
		j1.setNombre("Metal Gear Solid 4");
		j1.setCompania("Bthesda");
		j1.setPrecio(275);
		daoJuego.save(j1);
		
		Juego j2 = new Juego();
		j2.setNombre("Dragon ball");
		j2.setCompania("Alyespress");
		j2.setPrecio(85);
		daoJuego.save(j2);
		
		Juego j3 = new Juego();
		j3.setNombre("Age OF Empire II");
		j3.setCompania("Los mejores");
		j3.setPrecio(1005);
		daoJuego.save(j3);
		
		Juego j4 = new Juego();
		j4.setNombre("Aprobar en la UEM");
		j4.setCompania("LA europea");
		j4.setPrecio(513);
		daoJuego.save(j4);
		
		Usuario user = new Usuario();
		user.setNombre("THE_BOSS");
		user.setPassword("Sacarun5mevalejeje");
		daoUsuario.save(user);
		
		List<Juego> listaJuego = daoJuego.findAll();
		for (Juego j : listaJuego) {
			System.out.println(j);
		}
		

	}
	

}
