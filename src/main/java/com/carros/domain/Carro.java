package com.carros.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Faz mapear a table carro para a classe carro, como tem o mesmo nome, esta tudo certo, se não olhar aula25 seção 5
public class Carro {
    // inica q é campo de chave primaria da tabela.
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // Faz com que quando salvar um novo carro, um auto incremento no id
    private Long id;
    private String nome;
    private String tipo;

    public Carro(){

    }
    public Carro(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
