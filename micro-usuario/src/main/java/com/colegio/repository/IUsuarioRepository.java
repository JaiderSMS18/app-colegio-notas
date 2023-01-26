package com.colegio.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegio.entity.Usuario;

@EnableScan
public interface IUsuarioRepository  {

	boolean existsByIdentificacion(String identificacion);
}
