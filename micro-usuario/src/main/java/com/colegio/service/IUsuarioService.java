package com.colegio.service;

import com.colegio.entity.Usuario;

public interface IUsuarioService {

	public Iterable<Usuario> listDeUsuarios();
	public Usuario getOne(String usuarioId);
	public Usuario saveUsuario(Usuario dto);
	public Usuario updateUsuario(Usuario dto);
	public void deleteUsuarioById(String usuarioId);
	public boolean existsId(String usuarioId);
	public boolean existsIdentificacion(String identificacion);
}
