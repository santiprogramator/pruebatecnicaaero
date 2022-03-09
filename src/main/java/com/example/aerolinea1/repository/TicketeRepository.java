package com.example.aerolinea1.repository;

import com.example.aerolinea1.Entity.Tickete;
import com.example.aerolinea1.Entity.Trayecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketeRepository extends JpaRepository<Tickete,Integer> {
    List<Tickete> findByIdVuelo(int idvuelo);
    List<Tickete> findByEdad(int edad);
}