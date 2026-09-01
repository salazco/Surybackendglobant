package com.example.sury_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sury_back.models.Contacto_emergencia;

@Repository
public interface IContacto_emergencia extends JpaRepository<Contacto_emergencia, Integer> {

}
