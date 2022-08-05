package com.carros.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //trasnforma a classe CarroService em um bin q será gerenciado por spring
public class CarroService {
    public List<Carro> getCarros (){
        List<Carro> carros = new ArrayList<>();
        carros.add( new Carro (1L, "Bandeirantes"));
        carros.add( new Carro (2L, "Versa"));
        carros.add( new Carro (3L, "Kics"));
        return carros;
    }
}
