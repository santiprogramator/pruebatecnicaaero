package com.example.aerolinea1.controller;

import com.example.aerolinea1.Entity.Trayecto;
import com.example.aerolinea1.service.TrayectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/trayecto")
public class TrayectoController {

    TrayectoService trayectoService;

    public TrayectoController(TrayectoService trayectoService) {
        this.trayectoService = trayectoService;
    }

    @GetMapping("/getOrigenes")
    public ResponseEntity<Trayecto> getOrigenes() {
        List<Trayecto> trayectos = trayectoService.getOrigenes();
        return new ResponseEntity(trayectos, HttpStatus.OK);
    }

    @GetMapping("/getDestinos")
    public ResponseEntity<Trayecto> getDestinos(@RequestParam("origen") String origen) {
        List<Trayecto> trayectos = trayectoService.getDestinos(origen);
        return new ResponseEntity(trayectos, HttpStatus.OK);
    }
}