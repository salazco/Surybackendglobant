package com.example.sury_back.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mensaje_chat {
    private Integer id_mensaje;
    private Integer id_usuario;
    private String contenido;
    private String remitente;
    private LocalDate fecha_hora;
    public Integer getId_mensaje() {
        return id_mensaje;
    }
    public void setId_mensaje(Integer id_mensaje) {
        this.id_mensaje = id_mensaje;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getRemitente() {
        return remitente;
    }
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    public LocalDate getFecha_hora() {
        return fecha_hora;
    }
    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
    
}
