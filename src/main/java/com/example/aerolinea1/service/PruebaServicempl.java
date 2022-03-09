package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Pasajero;
import com.example.aerolinea1.repository.PruebaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PruebaServicempl implements PruebaService{

    private PruebaRepository pruebaRepository;

    public PruebaServicempl(PruebaRepository pruebaRepository) {
        this.pruebaRepository = pruebaRepository;
    }

    @Override
    public List<Pasajero> findAll() {
        return pruebaRepository.findAll();
    }

    @Override
    public List<Pasajero> findNombre(String nombre) {
        return pruebaRepository.findByNombre(nombre);
    }

    @Override
    public Pasajero save(Pasajero pasajero) {
        return pruebaRepository.save(pasajero);
    }


}