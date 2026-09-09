package com.example.sury_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sury_back.models.Usuario;
import com.example.sury_back.services.UsuarioServicio;

@RestController 
@RequestMapping("/sury/usuario")

public class Usuariocontrolador {


    @Autowired 
    private UsuarioServicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Usuario datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guadarUsuario(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarUsuarios());
    }
    }