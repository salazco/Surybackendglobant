package com.example.sury_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.sury_back.models.Cita_medica;
import com.example.sury_back.repositories.ICita_medica;

@Service
public class Cita_medicaServicios {
    @Autowired
   private ICita_medica repositorio;

   //rutina para guardar datos de usuarios
   public boolean guardarCita_medica(Cita_medica datosCita_medica){

    Cita_medica cita_medicaGuardado=this.repositorio.save(datosCita_medica);
    return true;
   }

   //rutina para buscar los usuarios 
   public List<Cita_medica>buscarCita_medicas(){

    return this.repositorio.findAll();
   }



    public Cita_medica buscarUsuarioPorId(Integer id){
        Optional<Cita_medica> citasmedicasBuscado = this.repositorio.findById(id);
            if(citasmedicasBuscado.isPresent()){
                return citasmedicasBuscado.get();
            }
            else{
                throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
            }
        
    }

}
