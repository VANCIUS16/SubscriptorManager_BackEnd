package com.sm.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.modelos.User;

@Repository
public interface InterfaceUsuario extends CrudRepository<User, Integer>{

}
