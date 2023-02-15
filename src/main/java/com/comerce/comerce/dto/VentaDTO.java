package com.comerce.comerce.dto;

import com.comerce.comerce.entity.Articulo;
import jakarta.persistence.OneToOne;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class VentaDTO implements Serializable {

    private Integer idVenta;
    private Date fecha;
    private ArticuloDTO articuloVendido;
    private int cantidad;

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

    public ArticuloDTO getArticuloVendido() {
        return articuloVendido;
    }

    public void setArticuloVendido(ArticuloDTO articuloVendido) {
        this.articuloVendido = articuloVendido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
