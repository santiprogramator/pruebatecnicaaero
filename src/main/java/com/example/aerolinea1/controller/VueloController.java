package com.example.aerolinea1.controller;


import com.example.aerolinea1.Entity.Vuelo;
import com.example.aerolinea1.service.VueloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vuelo")
public class VueloController {
    VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

    @GetMapping("/getvuelo")
    public ResponseEntity<Vuelo> getVuelos() {
        List<Vuelo> vuelos = vueloService.getVuelos();
        return new ResponseEntity(vuelos, HttpStatus.OK);
    }

    @GetMapping("/findByPasajeros")
    public ResponseEntity<Vuelo> findByCantidadPasajeros(@RequestParam(name = "cantidadPasajeros") int cantidadPasajeros) {
        List<Vuelo> vuelos = vueloService.findCantidadPasajeros(cantidadPasajeros);
        return new ResponseEntity(vuelos, HttpStatus.OK);
    }
}
