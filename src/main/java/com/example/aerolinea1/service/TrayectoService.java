package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Trayecto;


import java.util.List;

public interface TrayectoService {
    List<Trayecto> getOrigenes();

    List<Trayecto> getDestinos(String origen);
}


