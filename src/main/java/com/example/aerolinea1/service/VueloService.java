package com.example.aerolinea1.service;



import com.example.aerolinea1.Entity.Vuelo;

import java.util.List;

public interface VueloService {
    List<Vuelo> getVuelos();

    List<Vuelo> findCantidadPasajeros(int cantidadPasajeros);
}
