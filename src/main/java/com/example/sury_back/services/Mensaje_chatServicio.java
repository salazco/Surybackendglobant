package com.example.sury_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.models.Mensaje_chat;
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
}
