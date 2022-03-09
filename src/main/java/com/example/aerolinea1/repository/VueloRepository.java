package com.example.aerolinea1.repository;



import com.example.aerolinea1.Entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
    List<Vuelo> findByCantidadPasajeros(int CantidadPasajeros);

}
