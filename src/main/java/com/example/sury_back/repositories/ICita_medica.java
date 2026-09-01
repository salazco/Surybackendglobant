package com.example.sury_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sury_back.models.Cita_medica;

@Repository
public interface ICita_medica extends JpaRepository<Cita_medica, Integer>{

}
