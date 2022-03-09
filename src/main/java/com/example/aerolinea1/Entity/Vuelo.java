package com.example.aerolinea1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private int idvuelo;
    @Column(name = "DSCANTIDADPASAJEROS")
    private int cantidadPasajeros;

    @ManyToOne
    @JoinColumn(name = "trayecto_id",referencedColumnName = "ID")
    private Trayecto trayecto;

    public static final double SILLASAVION = 25;
    @Column(name = "DSHORASALIDA")
    private double horaPartida;
    @Column(name = "DSCANTIDADMILLAS")
    private int cantidadMillas;
    @Column(name = "DSFECHA")
    private int fecha;

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public double getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(double horaPartida) {
        this.horaPartida = horaPartida;
    }

    public int getCantidadMillas() {
        return cantidadMillas;
    }

    public void setCantidadMillas(int cantidadMillas) {
        this.cantidadMillas = cantidadMillas;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }


    public Vuelo() {
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idvuelo=" + idvuelo +
                ", cantidadPasajeros=" + cantidadPasajeros +
                ", trayecto=" + trayecto +
                ", horaPartida=" + horaPartida +
                ", cantidadMillas=" + cantidadMillas +
                ", fecha=" + fecha +
                '}';
    }
}
