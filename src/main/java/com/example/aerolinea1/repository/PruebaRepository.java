package com.example.aerolinea1.repository;


import com.example.aerolinea1.Entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PruebaRepository extends JpaRepository<Pasajero, String> {
    List<Pasajero> findByNombre(String nombre);
}