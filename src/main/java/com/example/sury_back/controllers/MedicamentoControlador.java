package com.example.sury_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sury_back.models.Medicamento;
import com.example.sury_back.services.MedicamentoServicio;

@RestController 
@RequestMapping ("/sury/medicamentos")
public class MedicamentoControlador {

    @Autowired 
    private MedicamentoServicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Medicamento datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarMedicamento(datos));
    }
     @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarMedicamentos());
    }
}
    
