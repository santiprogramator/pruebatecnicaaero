package com.example.aerolinea1.controller;


import com.example.aerolinea1.Entity.Tickete;

import com.example.aerolinea1.service.TicketeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/api/tickete")
public class TicketeController {

    @Autowired
    TicketeService ticketeService;
    @GetMapping("/getjubilados")
    public ResponseEntity<Tickete> getdescuentoJubilado(@RequestParam("edad")int edad) {
        List<Tickete> ticketes = ticketeService.getdescuentoJubilado(edad);
        return new ResponseEntity(ticketes, HttpStatus.OK);
    }
    @GetMapping("/getdescuentoinfantes")
    public ResponseEntity<Tickete> getDescuentoInfante(@RequestParam("edad") int edad) {
        List<Tickete> ticketes = ticketeService.getdescuentoInfante(edad);
        return new ResponseEntity(ticketes, HttpStatus.OK);
    }
    @GetMapping("/getdecuentopasajerofrecuente")
    public ResponseEntity<Tickete> getdescuentoPasajeroFrecuente(@RequestParam("idvuelo") int idvuelo) {
        List<Tickete> ticketes = ticketeService.getdescuentoPasajeroFrecuente(idvuelo);
        return new ResponseEntity(ticketes, HttpStatus.OK);
    }

    @GetMapping("/getdescuentoViajero")
    public ResponseEntity<Tickete> getdescuentoViajero(@RequestParam("idvuelo") int idvuelo) {
        List<Tickete> ticketes = ticketeService.getdescuentoViajero(idvuelo);
        return new ResponseEntity(ticketes, HttpStatus.OK);


}}
