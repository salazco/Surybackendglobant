package com.example.sury_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sury_back.models.Mensaje_chat;

@Repository
public interface IMensaje_chat extends JpaRepository<Mensaje_chat, Integer> {

}
