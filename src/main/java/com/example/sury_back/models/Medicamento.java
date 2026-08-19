package com.example.sury_back.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicamento {
    private Integer id_medicamento;
    private Integer ud_usuario;
    private String nombre;
    private String dosis;
    private String frecuencia;
    public Integer getId_medicamento() {
        return id_medicamento;
    }
    public void setId_medicamento(Integer id_medicamento) {
        this.id_medicamento = id_medicamento;
    }
    public Integer getUd_usuario() {
        return ud_usuario;
    }
    public void setUd_usuario(Integer ud_usuario) {
        this.ud_usuario = ud_usuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public String getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
}
