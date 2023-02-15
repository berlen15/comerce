package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArticuloRepository extends JpaRepository<Articulo, Integer> {
    List<Articulo> findByDisponible(String disponible);
}
