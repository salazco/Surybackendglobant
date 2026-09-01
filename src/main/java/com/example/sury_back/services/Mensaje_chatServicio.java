package com.example.sury_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sury_back.repositories.IMensaje_chat;

@Service
public class Mensaje_chatServicio {
    @Autowired
    IMensaje_chat repositorio;
}
