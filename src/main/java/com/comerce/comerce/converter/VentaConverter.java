package com.comerce.comerce.converter;

import com.comerce.comerce.dto.VentaDTO;
import com.comerce.comerce.entity.Venta;

public class VentaConverter {

    private final ArticuloConverter articuloConverter = new ArticuloConverter();
    public Venta dto2pojo(VentaDTO ventaDTO){
        Venta venta = new Venta();

        venta.setIdVenta(ventaDTO.getIdVenta());
        venta.setCantidad(ventaDTO.getCantidad());
        venta.setFecha(ventaDTO.getFecha());
        venta.setArticuloVendido(articuloConverter.dto2pojo(ventaDTO.getArticuloVendido()));

        return venta;
    }

    public VentaDTO pojo2dto(Venta venta){
        VentaDTO ventaDTO = new VentaDTO();

        ventaDTO.setIdVenta(venta.getIdVenta());
        ventaDTO.setCantidad(venta.getCantidad());
        ventaDTO.setFecha(venta.getFecha());
        ventaDTO.setArticuloVendido(articuloConverter.pojo2dto(venta.getArticuloVendido()));

        return ventaDTO;
    }
}
