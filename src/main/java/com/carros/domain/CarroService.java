package com.carros.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //trasnforma a classe CarroService em um bin q será gerenciado por spring
public class CarroService {

    //O @Autowired injeta dependencia
    @Autowired // Para usar a Interface Carro Repositorio tenho que fazer isso q esta na nesta linha e na de baixo
    private CarroRepository rep;

    public Iterable<Carro> getCarros (){
        return rep.findAll();
    }

    public Optional<Carro> getCarroById(Long id) {
        return rep.findById(id);
    }

    public Iterable<Carro> getCarroByTipo(String tipo) {
        return rep.findByTipo(tipo); // Metodo não existe, ver como ele faz na aula 28 seção 5.
    }

    public Carro insert(Carro carro) {
        Assert.isNull(carro.getId(), "Não foi possível inserir o registro");
        return rep.save(carro);
    }

    public Carro update(Carro carro, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro 11");

        // Busca o carro no banco de dados
        System.out.println("Id --: " + id);
        Optional<Carro> optional = getCarroById(id);
        System.out.println("TEM ISSO AQUI:  " + optional);
        System.out.println("TEM ISSO AQUI2--:  " + optional.get());
        if(optional.isPresent()) {
            Carro db = optional.get();
            // Copiar as propriedades
            db.setNome(carro.getNome());
            db.setTipo(carro.getTipo());
            System.out.println("Carro id " + db.getId());

            // Atualiza o carro
            rep.save(db);

            return db;
        } else {
            //return null;
            throw new RuntimeException("Não foi possível atualizar o registro22");
        }
    }

    public void delete(Long id) {
        rep.deleteById(id);
    }

    public List<Carro> getCarrosFake (){
        List<Carro> carros = new ArrayList<>();
        carros.add( new Carro (1L, "Bandeirantes"));
        carros.add( new Carro (2L, "Versa"));
        carros.add( new Carro (3L, "Kics"));
        return carros;
    }



}
