package com.carros.api;

import com.carros.domain.Carro;
import com.carros.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // todos os web services precisão estar anotados com essa notação, é isso que TRANSFORMA essa CLASSE em um service HASH
@RequestMapping("/api/v1/carros") // Basicamente irá dizer q esse WebService esta mapeado para o barra neste caso.
public class CarrosController {
    //private CarroService service = new CarroService();

    /* Não precisa dar um new na classe service pois assim como aconteceu no Classe CarroSerive adcionando
    o @Service aqui só precisamos adiconar o @Autowired que ele cria o obj */
    @Autowired
    private CarroService service;
    @GetMapping()// usa o "/" do mapeamento acima por default ao chamar essa página irá chamar o GetMapping, isso acontce pq apliquei o @GetMapping, neste caso ele herda ("/") feito no RequestMapping se eu não passar nada.
    public Iterable<Carro> get(){

        return service.getCarros();
    }

    @GetMapping("/{id}")// usa o "/" do mapeamento acima por default ao chamar essa página irá chamar o GetMapping, isso acontce pq apliquei o @GetMapping, neste caso ele herda ("/") feito no RequestMapping se eu não passar nada.
    public Optional<Carro> get(@PathVariable("id") Long id){

        return service.getCarroById(id);
    }

    @GetMapping("/tipo/{tipo}")// usa o "/" do mapeamento acima por default ao chamar essa página irá chamar o GetMapping, isso acontce pq apliquei o @GetMapping, neste caso ele herda ("/") feito no RequestMapping se eu não passar nada.
    public Iterable<Carro> getCarrosByTipo(@PathVariable("tipo") String tipo){

        return service.getCarroByTipo(tipo);
    }

    @PostMapping
    public String post(@RequestBody Carro carro){
        Carro c =  service.insert(carro);
        return "Carro salvo com sucesso: " + c.getId();
    }

    @PutMapping("/{id}")
    public String put(@PathVariable("id") Long id, @RequestBody Carro carro){
        Carro c = service.update(carro, id);
        return "Carro atualizado com sucesso: " +  c.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);

        return "Carro deletado com sucesso!";
    }






}
