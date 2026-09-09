package com.example.sury_back.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sury_back.models.Mensaje_chat;
import com.example.sury_back.services.Mensaje_chatServicio;

@RestController 
@RequestMapping ("sury/mensajechat")
public class MensajechatControlador {

    @Autowired 
    private Mensaje_chatServicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Mensaje_chat datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarMensaje_chat(datos));
    }
     @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.BuscarMensaje_chat());
}
}
