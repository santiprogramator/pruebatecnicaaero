package com.example.aerolinea1.Entity;

import javax.persistence.*;
@Entity

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;

   @Column(name = "DSVALORTOTAL", length = 50)
   private String valorTotal;

   @Column(name = "DSESTADO")
   private boolean estado;

   @ManyToOne
   @JoinColumn(name = "vuelo_ida_id",referencedColumnName = "ID")
   private Vuelo vueloIda;

   @ManyToOne
   @JoinColumn(name = "vuelo_vuelta_id",referencedColumnName = "ID")
   private Vuelo vueloVuelta;

   @ManyToOne
   @JoinColumn(name = "tickete_id",referencedColumnName = "ID")
   private Tickete tickete;

   public Tickete getTickete() {
      return tickete;
   }

   public void setTickete(Tickete tickete) {
      this.tickete = tickete;
   }

   public Vuelo getVueloVuelta() {
      return vueloVuelta;
   }

   public Vuelo getVueloIda() {
      return vueloIda;
   }

   public void setVueloIda(Vuelo vueloIda) {
      this.vueloIda = vueloIda;
   }

   public void setVueloVuelta(Vuelo vueloVuelta) {
      this.vueloVuelta = vueloVuelta;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getValorTotal() {
      return valorTotal;
   }

   public void setValorTotal(String valorTotal) {
      this.valorTotal = valorTotal;
   }

   public boolean isEstado() {
      return estado;
   }

   public void setEstado(boolean estado) {
      this.estado = estado;
   }



   @Override
   public String toString() {
      return "Reserva{" +
              "id=" + id +
              ", valorTotal='" + valorTotal + '\'' +
              ", estado=" + estado +
              '}';
   }
}
