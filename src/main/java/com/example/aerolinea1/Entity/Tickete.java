package com.example.aerolinea1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ticketes")
public class Tickete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Id
    @Column(name = "ID")
    private int codigo;
    @Column(name = "DSVALORUNITARIO")
    private String valorunitario;

    @ManyToOne
    @JoinColumn(name = "ciudadOrigen", referencedColumnName = "ID")
    private Pasajero pasajero;

    @Column(name = "DSDESCUENTOJUBILADO")
    private String descuentoJubilado;
    @Column(name = "DSDESCUENTOINFANTE")
    private String descuentoInfante;
    @Column(name = "DSDESCUENTOVIAJEROFRECUENTE")
    private String descuentoViajeroFrecuente;
    @Column(name = "DSDESCUENTOVIAJERO")
    private String descuentoViajero;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(String valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getDescuentoJubilado() {
        return descuentoJubilado;
    }

    public void setDescuentoJubilado(String descuentoJubilado) {
        this.descuentoJubilado = descuentoJubilado;
    }

    public String getDescuentoInfante() {
        return descuentoInfante;
    }

    public void setDescuentoInfante(String descuentoInfante) {
        this.descuentoInfante = descuentoInfante;
    }

    public String getDescuentoViajeroFrecuente() {
        return descuentoViajeroFrecuente;
    }

    public void setDescuentoViajeroFrecuente(String descuentoViajeroFrecuente) {
        this.descuentoViajeroFrecuente = descuentoViajeroFrecuente;
    }

    public String getDescuentoViajero() {
        return descuentoViajero;
    }

    public void setDescuentoViajero(String descuentoViajero) {
        this.descuentoViajero = descuentoViajero;
    }
}
