package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")

public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
  
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="id_articulo")
    private Long idArticulo;
      private Long idCategopria;
    private String descripcion;
    private String detalle;
    private Double precio;
    private int existencia;
    private boolean activo;


    public Articulo() {
    }

    public Articulo(Long idCategopria, String descripcion, String detalle, Double precio, int existencia, boolean activa) {
        this.idCategopria = idCategopria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.activo = activa;
    }

  

}
