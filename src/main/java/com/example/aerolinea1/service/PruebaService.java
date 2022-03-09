package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Pasajero;

import java.util.List;


public interface PruebaService {
    List<Pasajero> findAll();

    List<Pasajero> findNombre(String nombre);

    Pasajero save(Pasajero prueba);
}


