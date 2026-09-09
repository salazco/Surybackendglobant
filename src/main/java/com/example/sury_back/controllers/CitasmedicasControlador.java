package com.example.sury_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sury_back.models.Cita_medica;
import com.example.sury_back.services.Cita_medicaServicios;

@RestController 
@RequestMapping ("/sury/citasmedicas")
public class CitasmedicasControlador {

    @Autowired 
    private Cita_medicaServicios servicios;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Cita_medica datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicios.guardarCita_medica(datos));
    }

     @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicios.buscarCita_medicas());
}
}
