package com.comerce.comerce.entity;

import javax.persistence.*;

@Entity
@Table(name="articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticulo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="disponible")
    private String disponible;
    @Column(name="precio")
    private double precio;

    public int getCodigoArticulo() {
        return idArticulo;
    }

    public void setCodigoArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
