package com.mvc.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entidad.Juego;

@Repository
public interface DaoJuego extends JpaRepository<Juego, Integer> {

}

