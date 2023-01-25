package com.colegio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Usuario;
import com.colegio.repository.IUsuarioRepository;
import com.colegio.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
    private IUsuarioRepository usuarioRepository;

	@Override
	public Iterable<Usuario> listDeUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getOne(String usuarioId) {
		return usuarioRepository.findById(usuarioId).orElse(null);
	}

	@Override
	public Usuario saveUsuario(Usuario dto) {
		return usuarioRepository.save(dto);
	}

	@Override
	public Usuario updateUsuario(Usuario dto) {
		Usuario usuario = usuarioRepository.findById(dto.getUsuarioId()).orElse(null);
        usuario.setUsuarioId(dto.getUsuarioId());
        usuario.setIdentificacion(dto.getIdentificacion());
        usuario.getCalificaciones(Usuario.builder()
                .ciudad(dto.getDireccionDto().getCiudad()).calle(dto.getDireccionDto().getCalle()).cp(dto.getDireccionDto().getCp()).build());
        return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteUsuarioById(String usuarioId) {
		usuarioRepository.deleteById(usuarioId);
	}

	@Override
	public boolean existsId(String usuarioId) {
		return usuarioRepository.existsById(usuarioId);
	}

	@Override
	public boolean existsIdentificacion(String identificacion) {
		return usuarioRepository.existsByIdentificacion(identificacion);
	}
	
}
