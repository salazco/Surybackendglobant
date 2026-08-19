package com.example.sury_back.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cita_medica {
    private Integer id_cita;
    private Integer id_usuario;
    private String especialidad;
    private LocalDate fecha_hora;
    private String medico;
    public Integer getId_cita() {
        return id_cita;
    }
    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public LocalDate getFecha_hora() {
        return fecha_hora;
    }
    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }

    


}
