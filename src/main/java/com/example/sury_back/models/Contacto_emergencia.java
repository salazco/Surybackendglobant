package com.example.sury_back.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contacto_emergencia {
    private Integer id_contacto;
    private Integer id_usuario;
    private String nombre_contacto;
    private String telefono;
    private String parentesco;
    public Integer getId_contacto() {
        return id_contacto;
    }
    public void setId_contacto(Integer id_contacto) {
        this.id_contacto = id_contacto;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre_contacto() {
        return nombre_contacto;
    }
    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
