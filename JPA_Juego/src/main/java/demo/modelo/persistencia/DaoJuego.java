package demo.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.modelo.entidad.Juego;

@Repository
public interface DaoJuego extends JpaRepository<Juego, Integer>{

}
