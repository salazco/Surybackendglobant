package com.example.sury_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.models.Medicamento;
import com.example.sury_back.repositories.IMedicamento;

@Service
public class MedicamentoServicio {
    @Autowired
private IMedicamento repositorio;

//rutina para guardar datos de usuario
public boolean guardarMedicamento(Medicamento datosMedicamento){

    Medicamento medicamentoGuardado=this.repositorio.save(datosMedicamento);
    return true;
}

//rutina para buscar todos los usuarios
public List<Medicamento>buscarMedicamentos(){

    return this.repositorio.findAll();
}
}
