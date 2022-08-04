package com.carros.domain;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    public List<Carro> getCarros() {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(id:1L, nome: "Fusca"));
        carros.add(new Carro(id:2L, nome: "Brasilia"));
        carros.add(new Carro(id:3L, nome: "Chevette"));
        return carros;
    }
}
