package com.example.aerolinea1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "trayectos")
public class Trayecto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Id
    @Column(name = "ID")
    private Integer codigo;
    @ManyToOne
    @JoinColumn(name = "origen", referencedColumnName = "ID")
    private Ciudad origen;
    @ManyToOne
    @JoinColumn(name = "destino", referencedColumnName = "idCiudad")
    private Ciudad destino;


    @Column(name = "DSREQUIEREESCALAS")
    private boolean RequiereEscalas;

    @Column(name = "DSDURACIONVUELO")
    private int duracionVuelo;

    public Trayecto() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public boolean isRequiereEscalas() {
        return RequiereEscalas;
    }

    public void setRequiereEscalas(boolean requiereEscalas) {
        RequiereEscalas = requiereEscalas;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(int duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }
}

