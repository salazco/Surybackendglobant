package com.example.sury_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.sury_back.models.Contacto_emergencia;
import com.example.sury_back.repositories.IContacto_emergencia;

@Service
public class Contacto_emergenciaServicio {
    @Autowired
private IContacto_emergencia repositorio;

//rutina para guardar datos de usuarios
public boolean guardarContacto_emergencia(Contacto_emergencia datosContacto_emergencia){

    Contacto_emergencia contacto_emergenciaGuardado=this.repositorio.save(datosContacto_emergencia);
    return true;
}

//rutina para buscar todos los usuarios 
public List<Contacto_emergencia>buscarMedicamento_emergencia(){
    return this.repositorio.findAll();
}


   public Contacto_emergencia buscarUsuarioPorId(Integer id){
        Optional<Contacto_emergencia> contactoemergenciabucado = this.repositorio.findById(id);
            if(contactoemergenciabucado.isPresent()){
                return contactoemergenciabucado.get();
            }
            else{
                throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
            }
        
    }

}