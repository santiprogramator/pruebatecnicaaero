package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Trayecto;
import com.example.aerolinea1.repository.TrayectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrayectoServicempl implements TrayectoService {
    TrayectoRepository trayectoRepository;

    public TrayectoServicempl(TrayectoRepository trayectoRepository){
        this.trayectoRepository = trayectoRepository;
    }

    @Override
    public List<Trayecto> getOrigenes() {
        return trayectoRepository.findAll();
    }

    @Override
    public List<Trayecto> getDestinos(String origen) {
        return trayectoRepository.findByOrigen(origen);
    }
}
