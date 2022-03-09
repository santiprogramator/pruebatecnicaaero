package com.example.aerolinea1.repository;

import com.example.aerolinea1.Entity.Trayecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TrayectoRepository extends JpaRepository<Trayecto, Integer> {

        List<Trayecto> findByOrigen(String Origen);

    }


