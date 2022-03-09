package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Tickete;

import java.util.List;

public interface TicketeService {

    List<Tickete> getdescuentoJubilado(int edad);

    List<Tickete> getdescuentoInfante(int edad);

    List<Tickete> getdescuentoPasajeroFrecuente(int idvuelo);

    List<Tickete> getdescuentoViajero(int idvuelo);
}
