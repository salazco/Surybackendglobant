package com.example.sury_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.models.Usuario;
import com.example.sury_back.repositories.IUsuario;

@Service
public class UsuarioServicio {

    @Autowired
    private IUsuario repositorio;

    //rutina para guardar datos de usuarios
    public boolean guadarUsuario(Usuario datosUsuario){
        
        Usuario usuarioGuardado=this.repositorio.save(datosUsuario);
        return true;


    } 


    //rutina para buscar todos los usuarios 
    public List<Usuario>buscarUsuarios(){

        return this.repositorio.findAll();
    }



    //rutina para buscar un usuario por su id 

}
