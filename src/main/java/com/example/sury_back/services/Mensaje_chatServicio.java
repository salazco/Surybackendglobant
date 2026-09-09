package com.example.sury_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.sury_back.models.Mensaje_chat;
import com.example.sury_back.models.Usuario;
import com.example.sury_back.repositories.IMensaje_chat;

@Service
public class Mensaje_chatServicio {
    @Autowired
   private IMensaje_chat repositorio;

   //rutina para guardar datos de usuario
   public boolean guardarMensaje_chat(Mensaje_chat datosMensaje_chat){

    Mensaje_chat mensaje_chatGuardado=this.repositorio.save(datosMensaje_chat);
    return true;
   }

   //utina para buscar todos los usuarios 
   public List<Mensaje_chat>BuscarMensaje_chat(){

    return this.repositorio.findAll();
   }

   public Mensaje_chat buscarUsuarioPorId(Integer id){
        Optional<Mensaje_chat> mensajechatbuscado = this.repositorio.findById(id);
            if(mensajechatbuscado.isPresent()){
                return mensajechatbuscado.get();
            }
            else{
                throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
            }
        
    }

}


