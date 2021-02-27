package com.mvc.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByNombreAndPassword(String nombre, String password);
}
