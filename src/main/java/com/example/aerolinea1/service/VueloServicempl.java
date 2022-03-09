package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Vuelo;
import com.example.aerolinea1.repository.TrayectoRepository;
import com.example.aerolinea1.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VueloServicempl implements VueloService {
    VueloRepository vueloRepository;

    public VueloServicempl(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    @Override
    public List<Vuelo> getVuelos() {
        return vueloRepository.findAll();
    }

    @Override
    public List<Vuelo> findCantidadPasajeros(int cantidadPasajeros) {
        return vueloRepository.findByCantidadPasajeros(cantidadPasajeros);
    }
}
