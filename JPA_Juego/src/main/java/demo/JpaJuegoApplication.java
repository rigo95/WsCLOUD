package demo;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Juego;
import demo.modelo.persistencia.DaoJuego;

@SpringBootApplication
public class JpaJuegoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaJuegoApplication.class, args);
		
		DaoJuego daoJuego = context.getBean("daoJuego", DaoJuego.class);
		
		Juego j1 = new Juego();
		j1.setNombre("Fallout 4");
		j1.setCompañia("Bethesda");
		j1.setPrecio(100);
		daoJuego.save(j1);
		
		Juego j2 = new Juego();
		j2.setNombre("DonAprobado");
		j2.setCompañia("EA Sport");
		j2.setPrecio(10000);
		daoJuego.save(j2);
		
		System.out.println("Lista de juegos");
		List<Juego> listaJuegos = daoJuego.findAll();
		for (Juego juego : listaJuegos) {
			System.out.println(juego);
		}
		
		Juego j = new Juego();
		j.setId(1);
		j.setNombre("SuperAprobado");
		j.setCompañia("LA EUROPEA");
		j.setPrecio(99);
		daoJuego.save(j);
		
		System.out.println("Juegos modificados ");
		List<Juego> listaModif = daoJuego.findAll();
		for (Juego juego : listaModif) {
			System.out.println(juego);
		}
		daoJuego.deleteById(2);
		
		System.out.println("Juego borrado");
		List<Juego> listaBorrar = daoJuego.findAll();
		for (Juego juego : listaBorrar) {
			System.out.println(juego);
		}
	}

}
