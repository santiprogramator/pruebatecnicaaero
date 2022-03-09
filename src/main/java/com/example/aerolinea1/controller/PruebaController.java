package com.example.aerolinea1.controller;

import com.example.aerolinea1.Entity.Pasajero;
import com.example.aerolinea1.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/prueba")
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping("/findAll")
    public ResponseEntity<Pasajero> findAll() {
        List<Pasajero> pasajeros = pruebaService.findAll();
        return new ResponseEntity(pasajeros, HttpStatus.OK);
    }

    @GetMapping("/findByNombre")
    public ResponseEntity<Pasajero> findByNombre(@RequestParam(name = "nombre") String nombre) {
        List<Pasajero> pruebas = pruebaService.findNombre(nombre);
        return new ResponseEntity(pruebas, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Pasajero> findByNombre(@RequestBody Pasajero pasajero) {
        Pasajero pruebaSave = pruebaService.save(pasajero);
        return new ResponseEntity(pruebaSave, HttpStatus.OK);
    }


}

