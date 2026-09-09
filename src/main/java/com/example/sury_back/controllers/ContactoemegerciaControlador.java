package com.example.sury_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sury_back.models.Contacto_emergencia;
import com.example.sury_back.services.Contacto_emergenciaServicio;

@RestController 
@RequestMapping ("/sury/contactodeemergencia")
public class ContactoemegerciaControlador {

    @Autowired 
    private Contacto_emergenciaServicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Contacto_emergencia datos){
    return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarContacto_emergencia(datos));
    }

     @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarMedicamento_emergencia());
}
}
