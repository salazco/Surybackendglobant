package com.example.sury_back.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    private Integer id_usuario;
    private String nombre_completo;
    private String correo;
    private String celular;
    private String contraseña_hash;
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getContraseña_hash() {
        return contraseña_hash;
    }
    public void setContraseña_hash(String contraseña_hash) {
        this.contraseña_hash = contraseña_hash;
    }
    
}
