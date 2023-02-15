package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Cesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICestaRepository extends JpaRepository<Cesta, Integer> {
}
