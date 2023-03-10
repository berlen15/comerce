package com.comerce.comerce.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenta;
    @Column(name="fecha")
    private Date fecha;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
    @Column(name="cantidad")
    private int cantidad;

    public Venta(Integer idVenta, Date fecha, Articulo articulo, int cantidad) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Venta(){}

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Articulo getArticuloVendido() {
        return articulo;
    }

    public void setArticuloVendido(Articulo articuloVendido) {
        this.articulo = articuloVendido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
