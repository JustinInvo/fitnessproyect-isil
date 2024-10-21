package com.Fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fitness.entity.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	Usuario findByCorreoAndPassword(String correo, String passsword);
}
