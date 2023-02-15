package com.comerce.comerce.repository;

import com.comerce.comerce.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
}
