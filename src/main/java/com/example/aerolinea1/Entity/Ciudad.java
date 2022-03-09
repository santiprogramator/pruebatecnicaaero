package com.example.aerolinea1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "DSNOMBRE", length = 50)
    private String nombre;

    @Column(name = "DSREQUIEREVISA")
    private boolean requiereVisa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRequiereVisa() {
        return requiereVisa;
    }

    public void setRequiereVisa(boolean requiereVisa) {
        this.requiereVisa = requiereVisa;
    }

    public Ciudad() {
    }
}
