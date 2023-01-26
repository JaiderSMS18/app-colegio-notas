package com.colegio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Usuario;
import com.colegio.service.IUsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
    IUsuarioService usuarioService;

    @GetMapping("/usuario")
    public ResponseEntity<Iterable<Usuario>> list(){
        return ResponseEntity.ok(usuarioService.listDeUsuarios());
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Usuario> getOne(@PathVariable("usuarioId") String usuarioId){
        if(!usuarioService.existsId(usuarioId))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(usuarioService.getOne(usuarioId));
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuarioDto){
        /*if(usuarioService.existsId(usuarioDto.getUsuarioId()))
            return new ResponseEntity("el id ya existe", HttpStatus.BAD_REQUEST);
        if(usuarioService.existsIdentificacion(usuarioDto.getIdentificacion()))
            return new ResponseEntity("ese nombre ya existe", HttpStatus.BAD_REQUEST); */
        return ResponseEntity.ok(usuarioService.saveUsuario(usuarioDto));
    }

    @PutMapping("/usuario")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuarioDto){
        /*if(!usuarioService.existsId(usuarioDto.getUsuarioId()))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        if(usuarioService.existsIdentificacion(usuarioDto.getIdentificacion()) && !usuarioService.getOne(usuarioDto.getUsuarioId()).getIdentificacion().equals(usuarioDto.getIdentificacion()))
            return new ResponseEntity("ese nombre ya existe", HttpStatus.BAD_REQUEST); */
        return ResponseEntity.ok(usuarioService.updateUsuario(usuarioDto));
    }

    @DeleteMapping("/usuario/{usuarioId}")
    public ResponseEntity<?> delete(@PathVariable("usuarioId") String usuarioId){
        if(!usuarioService.existsId(usuarioId))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        usuarioService.deleteUsuarioById(usuarioId);
        return new ResponseEntity("usuario eliminado", HttpStatus.OK);
    }
}
