package com.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController // todos os web services precisão estar anotados com essa notação, é isso que TRANSFORMA essa CLASSE em um service HASH
@RequestMapping("/") // Basicamente irá dizer q esse WebService esta mapeado para o barra neste caso.
public class IndexController {

    @GetMapping()// usa o "/" do mapeamento acima por default ao chamar essa página irá chamar o GetMapping, isso acontce pq apliquei o @GetMapping, neste caso ele herda ("/") feito no RequestMapping se eu não passar nada.
    public String get(){
        return "API DOS CARROS";
    }



     /*@PostMapping("/login")
    public String login(@RequestParam("login") String login1, @RequestParam("senha") String senha1){
        return "Login: "+ login1 + ", senha: " + senha1;
    }

   @GetMapping("/login/{login}/senha/{senha}")
    public String login(@PathVariable("login") String login1, @PathVariable("senha") String senha1){
        return "Login: "+ login1 + ", senha: " + senha1;
    }
    @GetMapping("/carros/{id}")
    public String getCarrosById(@PathVariable("id") Long id){
        return "Carro by id : " + id;
    }

    @GetMapping("/carros/tipo/{tipo}")
    public String getCarrosById(@PathVariable("tipo") String tipo){
        return "Lista de Carro : " + tipo;
    }

    @PostMapping()
    public String post(){
        return "Post Spring Boot teste";
    }


    @PutMapping()
    public String put(){
        return "Put Spring Boot teste";
    }

    @DeleteMapping()
    public String delete(){
        return "Delete Spring Boot teste";
    } */

}
