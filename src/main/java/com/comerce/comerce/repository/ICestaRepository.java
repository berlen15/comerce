package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Cesta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICestaRepository extends CrudRepository<Cesta, Integer> {
}
