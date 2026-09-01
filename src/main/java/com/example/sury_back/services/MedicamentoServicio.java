package com.example.sury_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.repositories.IMedicamento;

@Service
public class MedicamentoServicio {
    @Autowired
IMedicamento repositorio;
}
