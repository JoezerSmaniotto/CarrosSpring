package com.carros.domain;

import org.springframework.data.repository.CrudRepository;
// Essa interface ira se comunicar com o banco de dados
public interface CarroRepository extends CrudRepository <Carro, Long>{

    Iterable<Carro> findByTipo(String tipo);
}
