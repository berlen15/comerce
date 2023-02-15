package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo, Integer> {
    List<Articulo> findByDisponible(String disponible);
}
