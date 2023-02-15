package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<Venta, Integer> {
}
