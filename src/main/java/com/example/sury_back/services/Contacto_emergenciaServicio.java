package com.example.sury_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.repositories.IContacto_emergencia;

@Service
public class Contacto_emergenciaServicio {
    @Autowired
IContacto_emergencia repositorio;
}
