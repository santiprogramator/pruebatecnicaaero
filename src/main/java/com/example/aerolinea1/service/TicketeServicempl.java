package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Tickete;
import com.example.aerolinea1.repository.TicketeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketeServicempl implements TicketeService {
    TicketeRepository ticketeRepository;

    public TicketeServicempl(TicketeRepository ticketeRepository) {
        this.ticketeRepository = ticketeRepository;
    }

    @Override
    public List<Tickete> getdescuentoJubilado(int edad) { return TicketeRepository.findByIdVuelo(idvuelo);
    }



    @Override
    List<Tickete> getdescuentoInfante(int edad);

    @Override
    List<Tickete> getdescuentoPasajeroFrecuente(int idvuelo);

    @Override
    List<Tickete> getdescuentoViajero(int idvuelo);
}
