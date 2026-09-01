package com.example.sury_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sury_back.models.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
