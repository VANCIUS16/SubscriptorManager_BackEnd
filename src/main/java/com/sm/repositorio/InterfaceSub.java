package com.sm.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.modelos.Sub;

@Repository
public interface InterfaceSub extends CrudRepository<Sub, Integer>{

}
