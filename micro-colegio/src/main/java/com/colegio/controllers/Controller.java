package com.colegio.controllers;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Usuario;
import com.colegio.repository.IUsuarioRepo;
import com.colegio.service.impl.UsuarioServiceImpl;

@RestController
public class Controller {

	@Autowired
    private IUsuarioRepo usarioRepo;
	
	@PostMapping("/usuario")
    public Usuario saveUsuario(@RequestBody Usuario Usuario) {
        return usarioRepo.save(Usuario);
    }

   /* @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("id") Integer usuarioId) {
        return ResponseEntity.ok(usarioService.getEmployeeById(usuarioId));
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<String> deleteUsuario(@PathVariable("id") Integer usuarioId) {
        return ResponseEntity.status(HttpStatus.SC_NO_CONTENT).body(usarioService.deleteById(usuarioId));
    }

    @PutMapping("/usuario")
    public ResponseEntity<Integer> updateUsuario(//@PathVariable("id") Integer usuarioId,
    		@RequestBody Usuario Usuario) {
        return ResponseEntity.ok(usarioService.update(Usuario));
    }*/
}
